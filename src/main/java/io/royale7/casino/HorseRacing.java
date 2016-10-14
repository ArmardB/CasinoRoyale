package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazhirjackson on 10/13/16.
 */
public class HorseRacing extends LuckGames{
    public int userChoice;
    public List<Horse> horsesTrack;
    public HorseMenus horseMenus;
    protected List<Player> players = new ArrayList<>();

    public HorseRacing() {
        horsesTrack = new ArrayList<>();
    }

    @Override
    public void init() {
        run();
    }

    public Horse createHorse(String name, String speed){
        Horse newHorse = new Horse(name, speed);
        return newHorse;
    }

    public void putHorsesOnTrack(Horse horsey) {
        horsesTrack.add(horsey);
    }

    private void run() {

    }

    private void loopThroughRaceToshow() {
        int count = 1;
        while(count < 5){
            horseMenus.momentInRace(count);
            horseMenus.horsesPosOnTrack();
            count++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                String error = "Error with Thread.sleep";
                horseMenus.outputLn(error);
            }
        }
        
    }
    public List<Horse> getHorseTrack(){ return horsesTrack;}
    private Horse result() {
        return null;
    }
    private List<Horse> shuffleHorsesPosition() {
        return null;
    }

    public class Horse {
        private String name;
        private String speed;

        public Horse(String name, String speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public String getSpeed() {
            return speed;
        }

        @Override
        public String toString(){
            String nameAndSpeed = this.name + " with a speed of " + this.speed + " mph";
            return nameAndSpeed;
        }

    }
    private class HorseMenus extends Display {

        public void askWhichHorseBettingOn() {
            String horsePick = "Which horse would you like to bet on?"+
                    "\n 1: " + horsesTrack.get(1).toString() + "\n 2: " + horsesTrack.get(2).toString()+
                    "\n 3: " + horsesTrack.get(3).toString() + "\n 4: " + horsesTrack.get(4).toString();
            outputLn(horsePick);
        }

        public void askForBetAmountPrompt() {
            String placeBet = "Please Enter your Bet amount :)";
            outputLn(placeBet);
        }

        public void horsesStart() {
            String starting = "*Pow* And the Horses are on their way!";
            outputLn(starting);
        }

        public void horsesPosOnTrack(){
            String horsesPositions =
                    "\n First Place! :D : " + horsesTrack.get(1) + "\n Second Place :) : " + horsesTrack.get(2)+
                    "\n Third Place :( : " + horsesTrack.get(3) + "\n Fourth Place :( : " + horsesTrack.get(4);
            outputLn(horsesPositions);
        }
        public void momentInRace(int i){
            String fourthOfAMile = i + "/4 Miles currently and the standings are!:";
            outputLn(fourthOfAMile);
        }
        


    }

}
