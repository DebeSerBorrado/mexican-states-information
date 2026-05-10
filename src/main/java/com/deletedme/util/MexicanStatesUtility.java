package com.deletedme.util;

import com.deletedme.dto.Municipality;
import com.deletedme.dto.State;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class MexicanStatesUtility {
    private static final String JSON_FILE = "mexican_states_information.json";
    private static final ObjectMapper mapper = new ObjectMapper();

    private static final Map<MexicanState, State> STATES;

    static {
        try (InputStream is = MexicanStatesUtility.class.getClassLoader().getResourceAsStream(JSON_FILE)) {
            if (is == null) {
                throw new RuntimeException("File " + JSON_FILE + " not found in classpath.");
            }
            List<State> loadedStates = mapper.readValue(is, new TypeReference<>() {});

            STATES = Collections.unmodifiableMap(
                    EnumSet.allOf(MexicanState.class).stream()
                    .collect(java.util.stream.Collectors.toMap(
                            ms -> ms,
                            ms -> loadedStates.stream().filter(s -> s.getName().equalsIgnoreCase(ms.getFullName())).findFirst().orElse(new State()))));
        } catch (IOException e) {
            throw new RuntimeException("Error loading states from JSON", e);
        }
    }

    public static List<State> getAllStates() {
        return STATES.values().stream().toList();
    }

    public static State getState(final MexicanState state) throws IOException {
        final State stateFound = STATES.get(state);
        if (stateFound == null) {
            throw new IOException("State " + state.getFullName() + " not found.");
        }
        return stateFound;
    }

    public static State getStateByMunicipalityName(final String municipalityName) throws IOException {
        return STATES.values().stream()
                .filter(state -> state.getMunicipalities().stream()
                        .anyMatch(m -> m.getName().equalsIgnoreCase(municipalityName)))
                .findFirst()
                .orElseThrow(() -> new IOException("Municipality " + municipalityName + " not found."));
    }

    public static List<Municipality> getMunicipalitiesByState(final MexicanState state) throws IOException {
        if (!STATES.containsKey(state)) {
            throw new IOException("State  " + state.getFullName() + " not found.");
        }
        return STATES.get(state).getMunicipalities();
    }
}
