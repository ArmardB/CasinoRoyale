package io.royale7.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Blackjack extends CardGames {

    BlackJackDisplay blackJackDisplay = new BlackJackDisplay();
    private List<CardPlayer> blackjackPlayers = new ArrayList<>();

    public Blackjack(ArrayList<Player> players){
        super(players);
        this.blackjackPlayers = super.cardPlayers;
    }

    public void init(){
        blackJackDisplay.displayWelcomeMessage();
    }

    public class BlackJackDisplay{
        public void displayWelcomeMessage(){
            Display.outputLn("Welcome to the game of BlackJack");
        }
    }

}
