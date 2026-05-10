package com.deletedme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Municipality {
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("zone")
    private String zone;

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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Municipality{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}
