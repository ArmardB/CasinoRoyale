package io.royale7.casino;

import java.util.*;

/**
 * Created by nazhirjackson on 10/13/16.
 */
public class HorseRacing extends LuckGames{
    public Horse userChoice;
    public List<Horse> horsesTrack;
    public HorseMenus horseMenus;
    protected Player player = new Player();

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());
        HorseRacing s = new HorseRacing(playerList);
        s.init();
    }

    public HorseRacing(List<Player> players) {
        super(players);
        this.player = super.luckPlayers.get(0);
        horsesTrack = new ArrayList<>();
        horseMenus = new HorseMenus();
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
    public void bet(double bet, Player player){

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

        horsesTrack.add(horse1);
        horsesTrack.add(horse2);
        horsesTrack.add(horse3);
        horsesTrack.add(horse4);
    }

    public void run() {
        putHorsesOnTrack();
        pickHorse();
        horseMenus.askForBetAmountPrompt();
        loopThroughRaceToshow();
        horseMenus.endOfRace();
    }

    private void pickHorse() {
        horseMenus.askWhichHorseBettingOn();
        try {
            int choice = UserInput.promptInt();
            userChoice = horsesTrack.get(choice);
        }catch (InputMismatchException | IndexOutOfBoundsException e){
            horseMenus.wrongInput();

        }
    }

    private void loopThroughRaceToshow() {
        int count = 1;
        horseMenus.horsesStart();
        while(count < 5){
            horsesTrack = shuffleHorsesPosition();
            horseMenus.momentInRace(count);
            horseMenus.horsesPosOnTrack();

            count++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                String error = "Error with Thread.sleep";
                horseMenus.outputLn(error);
            }
        }
        
    }
    public List<Horse> getHorseTrack(){ return horsesTrack;}

    Horse result() {
       Horse endOfRace = horsesTrack.get(1);
     return endOfRace;
    }
    public List<Horse> shuffleHorsesPosition() {

       List<Horse> shuffledTrack = horsesTrack;
               Collections.shuffle(shuffledTrack);
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
            String nameAndSpeed = getName() + " with a speed of " + getSpeed() + " mph";
            return nameAndSpeed;
        }

    }
    private class HorseMenus extends Display {

        public void thankYouMessage() {
            String thanks = "Thank you have a good one";
            outputLn(thanks);
        }

        public void wrongInput(){
            String input = "Sorry wrong input Please Enter a NUMBER\n";
            outputLn(input);
        }

        public void askWhichHorseBettingOn() {
            String horsePick = "Which horse would you like to bet on?"+
                    "\n 0: " + horsesTrack.get(0).toString() + "\n 1: " + horsesTrack.get(1).toString()+
                    "\n 2: " + horsesTrack.get(2).toString() + "\n 3: " + horsesTrack.get(3).toString();
            outputLn(horsePick);
        }

        public void askForBetAmountPrompt() {
            String placeBet = "Please Enter your Bet amount :)";
            outputLn(placeBet);
        }

        public void horsesStart() {
            String starting = "*Pow* And the Horses are on their way!\n";
            outputLn(starting);
        }

        public void horsesPosOnTrack(){
            String horsesPositions =
                    "\n First Place! :D : " + horsesTrack.get(0).toString() + "\n Second Place :) : " + horsesTrack.get(1).toString() +
                    "\n Third Place :( : " + horsesTrack.get(2).toString() + "\n Fourth Place :( : " + horsesTrack.get(3).toString();
           outputLn(horsesPositions);
        }
        public void momentInRace(int i){
            System.out.println("----------------------------------------------------");
            String fourthOfAMile = i + "/4 Miles currently and the standings are!:";
            outputLn(fourthOfAMile);
        }
        public void endOfRace() {
            System.out.println("----------------------------------------------------");
            String winner = "The Winning Horse is!!! : " + horsesTrack.get(0).getName();
            outputLn(winner);
        }
        


    }

}
