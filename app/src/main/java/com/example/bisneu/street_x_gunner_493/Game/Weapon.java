package com.example.bisneu.street_x_gunner_493.Game;

public class Weapon{
    private int cadence;
    private WeaponType type;

    public Weapon(int cadence, WeaponType type){
        this.cadence = cadence;
        this.type = type;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}

class WeaponType{
    public WeaponType(int type){

    }
}