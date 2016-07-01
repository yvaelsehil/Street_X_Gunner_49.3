package com.example.bisneu.street_x_gunner_493.Game;

/**
 *
 */
public class Weapon {
    private int cadence;
    private WeaponType type;

    /**
     * @param cadence
     * @param type
     */
    public Weapon(int cadence, WeaponType type) {
        this.cadence = cadence;
        this.type = type;
    }

    /**
     * @return
     */
    public int getCadence() {
        return cadence;
    }

    /**
     * @param cadence
     */
    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    /**
     * @return
     */
    public WeaponType getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(WeaponType type) {
        this.type = type;
    }
}

/**
 *
 */
class WeaponType{
    /**
     *
     * @param type
     */
    public WeaponType(int type){

    }
}