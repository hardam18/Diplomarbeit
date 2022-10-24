package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "daten")
public class Daten {
    
    public Daten() {
        }


    private int id;
    private double timestamp;
    private float temperatur;
    private float luftfeuchtigkeit;
    private float co2;
    private int wasserstandBecken;
    private int wasserstandAbwasser;
    private int wasserstandNährstoff;
    private float wasserTemp;
    private float tdsSensor;  

    

    
    public Daten(int id, double timestamp, float temperatur,
     float luftfeuchtigkeit, float co2, int wasserstandBecken,
            int wasserstandAbwasser, int wasserstandNährstoff,
             float wasserTemp, float tdsSensor) {
        this.id = id;
        this.timestamp = timestamp;
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.co2 = co2;
        this.wasserstandBecken = wasserstandBecken;
        this.wasserstandAbwasser = wasserstandAbwasser;
        this.wasserstandNährstoff = wasserstandNährstoff;
        this.wasserTemp = wasserTemp;
        this.tdsSensor = tdsSensor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public float getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(float temperatur) {
        this.temperatur = temperatur;
    }

    public float getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(float luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public float getCo2() {
        return co2;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }

    public int getWasserstandBecken() {
        return wasserstandBecken;
    }

    public void setWasserstandBecken(int wasserstandBecken) {
        this.wasserstandBecken = wasserstandBecken;
    }

    public int getWasserstandAbwasser() {
        return wasserstandAbwasser;
    }

    public void setWasserstandAbwasser(int wasserstandAbwasser) {
        this.wasserstandAbwasser = wasserstandAbwasser;
    }

    public int getWasserstandNährstoff() {
        return wasserstandNährstoff;
    }

    public void setWasserstandNährstoff(int wasserstandNährstoff) {
        this.wasserstandNährstoff = wasserstandNährstoff;
    }

    public float getWasserTemp() {
        return wasserTemp;
    }

    public void setWasserTemp(float wasserTemp) {
        this.wasserTemp = wasserTemp;
    }

    public float getTdsSensor() {
        return tdsSensor;
    }

    public void setTdsSensor(float tdsSensor) {
        this.tdsSensor = tdsSensor;
    }
}