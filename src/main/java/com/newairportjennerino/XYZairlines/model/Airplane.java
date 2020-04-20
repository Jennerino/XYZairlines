package com.newairportjennerino.XYZairlines.model;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ID")
    private int id;

    @Column (name = "NAME")
    private String name;

    @Column(name = "AIRPLANE_TYPE")
    private String airplaneType;

    @Column(name = "AIRPLANE_IS_FUELED")
    private boolean airplaneFueled;


    public Airplane(String name ) {

    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getAirplaneType() {
        return airplaneType;
    }
    public void setAirplaneType(String accountType) {
        this.airplaneType = airplaneType;
    }

    public boolean getAirplaneFueled() {
        return airplaneFueled;
    }
    public void setAirplaneFueled(boolean accountType) {
        this.airplaneFueled = airplaneFueled;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

