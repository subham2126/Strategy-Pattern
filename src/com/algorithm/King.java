package com.algorithm;

public class King extends Character {

    King(){
        weapon = new Gun();
    }

    King(Weapon weapon){

        this.weapon = weapon;
    }

    @Override
    public void fight() {

    }
}
