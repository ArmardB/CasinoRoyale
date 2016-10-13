package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class HighLow extends CardGames {

    public HighLowDisplay highLowDisplay = new HighLowDisplay();
    private List<CardPlayer> cardPlayers = new ArrayList<>();
    private boolean isPlaying = true;

    public HighLow(){
        this.cardPlayers = super.cardPlayers;
    }

    public void init(){
        highLowDisplay.displayCardPlayers();

        playGame();
    }

    public void playGame(){
        while(isPlaying){
            // Do some stuff


            Display.outputLn("Ch");

        }
    }

    public void verifyIfUserGuessIsCorrect(){
        // Test whether user's guess if higher or lower than current card
    }

    public Card getCardFromDeck(){

    }



    public class HighLowDisplay extends Display{

        public void displayCardPlayers(){
            outputLn("There are "+cardPlayers.size()+ " card players");
        }

    }





}
