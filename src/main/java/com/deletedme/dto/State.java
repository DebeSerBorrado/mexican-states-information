package com.deletedme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class State {
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("municipalities")
    private List<Municipality> municipalities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Municipality> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    @Override
    public String toString() {
        return "State{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", municipalities=" + municipalities +
                '}';
    }
}
