package com.algorithm;



// Strategy Pattern Example


public class Main {

    public static void main(String[] args) {
	// write your code here

        Character character = new Queen();
        character.fight();
        character = new Queen(new Gun());
        character.fight();
    }
}
