package io.royale7.casino;

import java.util.List;

/**
 * Created by nazhirjackson on 10/13/16.
 */
public class HorseRacing {
    public int userChoice;
    public List<Horse> horsesTrack;
    public HorseMenus horseMenus;

    public void init() {
    }

    private void putHorsesOnTrack() {

    }

    private void run() {

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

    }
    private class HorseMenus extends Display {

        public void askWhichHorseBettingOn() {
            String horsePick = "Which horse would you like to bet on?"+
                    "\n 1: " + horsesTrack.get(1) + "\n 2: " + horsesTrack.get(2)+
                    "\n 3: " + horsesTrack.get(3) + "\n 4: " + horsesTrack.get(4);
            outputLn(horsePick);
        }

        public void askForBetAmountPrompt() {
            String placeBet = "Please Enter your Bet amount :)";
            outputLn(placeBet);
        }

        public void horsesStart() {
            String starting = "*Pow* And the Horses are on their way!";
        }
        
        public void horsesPosOnTrack(){
            String horsesPositions =
                    "\n First Place! :D : " + horsesTrack.get(1) + "\n Second Place :) : " + horsesTrack.get(2)+
                    "\n Third Place :( : " + horsesTrack.get(3) + "\n Fourth Place :( : " + horsesTrack.get(4);
            outputLn(horsesPositions);
        }


    }

}
