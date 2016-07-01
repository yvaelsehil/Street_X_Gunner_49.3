package com.example.bisneu.street_x_gunner_493.Game;

/**
 * Created by yvael on 01/07/2016.
 */
public class Character {
    public static int DefaultLife = 100; //Vie par defaut d'un personnage

    private int life;
    private Weapon weap;
    private Bonus bonus;
    private int speed;

    /**
     *
     * @param weap
     */
    public Character(Weapon weap){
        this.weap = weap;
        this.life = DefaultLife;
        this.bonus = Bonus.None;
        this.speed = 1;
    }
}
