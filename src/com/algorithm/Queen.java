package com.algorithm;

public class Queen extends Character {



    Queen(){
          weapon = new BowAndArrowAttack();
    }

    Queen(Weapon weapon){
        this.weapon = weapon;
    }
    @Override
    public void fight() {
        weapon.attack();
    }

}
