package io.royale7.casino;

import java.util.*;

/**
 * Created by nazhirjackson on 10/13/16.
 */
public class HorseRacing extends LuckGame{
    public Horse userChoice;
    public Map<Integer, Horse> horsesTrack;
    public HorseMenus horseMenus;
    protected Player player = new Player();

    public HorseRacing(List<Player> players) {
        super(players);
        this.player = super.luckPlayers.get(0);
        horsesTrack = new HashMap<>();
    }

    @Override
    public void init() {
        run();
    }

    @Override
    public double settle(double winnings) {
        return 0;
    }

    @Override
    public double bet(double bet) {
        return 0;
    }

    public Horse createHorse(String name, String speed){
        Horse newHorse = new Horse(name, speed);
        return newHorse;
    }

    public void putHorsesOnTrack() {
        Horse horse1 = createHorse("JamesBond", "22.5");
        Horse horse2 = createHorse("Billy", "23");
        Horse horse3 = createHorse("Bob", "23.5");
        Horse horse4 = createHorse("Larry", "22");

        horsesTrack.put(1, horse1);
        horsesTrack.put(2, horse2);
        horsesTrack.put(3,horse3);
        horsesTrack.put(4,horse4);
    }

    private void run() {

        betOnHorse();


    }
    private void betOnHorse() {
        horseMenus.askWhichHorseBettingOn();
        try {
            int choice = UserInput.promptInt();
            userChoice = horsesTrack.get(choice);
        }catch (InputMismatchException e){
            horseMenus.wrongInput();
            horseMenus.askWhichHorseBettingOn();
        }
    }
    public void betAmount() {

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
    public Map<Integer, Horse> getHorseTrack(){ return horsesTrack;}

    Horse result() {
       Horse endOfRace = horsesTrack.get(1);
     return endOfRace;
    }
    private Map<Integer, Horse> shuffleHorsesPosition() {

        List<Integer> keys = new ArrayList(horsesTrack.keySet());
        Collections.shuffle(keys);
        Map<Integer, Horse> shuffledTrack = new HashMap<>();
        for (Integer o : keys) {

            shuffledTrack.put(o,horsesTrack.get(o));
        }
        return shuffledTrack;
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

        public void thankYouMessage() {
            String thanks = "Thank you have a good one";
            outputLn(thanks);
        }

        public void wrongInput(){
            String input = "Sorry wrong input Please Enter a NUMBER";
            outputLn(input);
        }

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
