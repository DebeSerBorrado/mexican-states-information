package com.deletedme.util;

public enum MexicanState {
    AGUASCALIENTES("01", "Aguascalientes"),
    BAJA_CALIFORNIA("02", "Baja California"),
    BAJA_CALIFORNIA_SUR("03", "Baja California Sur"),
    CAMPECHE("04", "Campeche"),
    COAHUILA("05", "Coahuila de Zaragoza"),
    COLIMA("06", "Colima"),
    CHIAPAS("07", "Chiapas"),
    CHIHUAHUA("08", "Chihuahua"),
    CIUDAD_DE_MEXICO("09", "Ciudad de México"),
    DURANGO("10", "Durango"),
    GUANAJUATO("11", "Guanajuato"),
    GUERRERO("12", "Guerrero"),
    HIDALGO("13", "Hidalgo"),
    JALISCO("14", "Jalisco"),
    ESTADO_DE_MEXICO("15", "Estado de México"),
    MICHOACAN("16", "Michoacán de Ocampo"),
    MORELOS("17", "Morelos"),
    NAYARIT("18", "Nayarit"),
    NUEVO_LEON("19", "Nuevo León"),
    OAXACA("20", "Oaxaca"),
    PUEBLA("21", "Puebla"),
    QUERETARO("22", "Querétaro de Arteaga"),
    QUINTANA_ROO("23", "Quintana Roo"),
    SAN_LUIS_POTOSI("24", "San Luis Potosí"),
    SINALOA("25", "Sinaloa"),
    SONORA("26", "Sonora"),
    TABASCO("27", "Tabasco"),
    TAMAULIPAS("28", "Tamaulipas"),
    TLAXCALA("29", "Tlaxcala"),
    VERACRUZ("30", "Veracruz de Ignacio de la Llave"),
    YUCATAN("31", "Yucatán"),
    ZACATECAS("32", "Zacatecas");

    private final String id;
    private final String fullName;

    MexicanState(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public static MexicanState getStateWithId(String id) {
        for (MexicanState state : values()) {
            if (state.id.equals(id)) {
                return state;
            }
        }
        return null;
    }

    public static MexicanState getStateWithName(String id) {
        for (MexicanState state : values()) {
            if (state.id.equals(id)) {
                return state;
            }
        }
        return null;
    }
}
