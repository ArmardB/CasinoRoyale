package io.royale7.casino;

import java.util.List;

public class HighLow extends CardGame {

    public HighLowDisplay highLowDisplay = new HighLowDisplay();
    private List<CardPlayer> cardPlayers;
    private boolean isPlaying = true;

    public HighLow(List<Player> players){
       super(players);
        this.cardPlayers = super.cardPlayers;
    }

    public void init(){
        highLowDisplay.displayCardPlayers();

        playGame();
    }

    public void playGame(){
        while(isPlaying){
            // Do some stuff
            deal(1);
            //Display.outputLn("CARD: " + cardPlayers.get(0).getHand().size());
            //2Display.outputLn("CARD: " + cardPlayers.get(1).getHand().get(0).getRank());

            //Display.outputLn("Will the next card be [H]igher or [L]ower...?");

            String userGuess = UserInput.promptString();



        }
    }

    public void verifyIfUserGuessIsCorrect(){
        // Test whether user's guess if higher or lower than current card

    }





    public class HighLowDisplay extends Display{

        public void displayCardPlayers(){
            outputLn("There are "+cardPlayers.size()+ " card players");
        }

    }





}
