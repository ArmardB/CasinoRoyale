package io.royale7.casino;

public class Craps extends Game {

    public Craps(){

    }
    public int rollDice(){
        int num1 = (int)(Math.random()*10)%6+1;
        int num2 = (int)(Math.random()*10)%6+1;
        return num1 + num2;
    }

}
