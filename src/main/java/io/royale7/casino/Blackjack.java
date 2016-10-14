package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class Blackjack extends CardGames {

    private BlackJackDisplay blackJackDisplay = new BlackJackDisplay();
    private List<CardPlayer> blackjackPlayers = new ArrayList<>();
    private Map<CardPlayer, List<Card>> blackjackPlayerHands;
    private int count = 1;
    public Blackjack(List<Player> players) {
        super(players);
        this.blackjackPlayers = super.cardPlayers;
    }



    public void init() {
        blackJackDisplay.displayWelcomeMessage();
        blackJackDisplay.displayPlayers();
        playGame();
        blackJackDisplay.displayWelcomeMessage();
    }

    private void playGame() {
        blackjackPlayerHands = deal(2);
        showHands();
    }

    private void showHands() {
        for (CardPlayer key : blackjackPlayerHands.keySet()) {
            blackJackDisplay.displayPlayersHands(key.getCardPlayerName());
            List<Card> hand = blackjackPlayerHands.get(key);
            count = 1;
            for (Card card : hand) {
                blackJackDisplay.displayCardCount();
                Display.outputLn(card.getRank() + " of " + card.getSuit());
                waitASecond();
                count++;
            }
            Display.outputLn("");
        }

    }

    private void waitASecond(){
        try {
            Thread.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private class BlackJackDisplay {
        
        private void displayWelcomeMessage() {
            Display.outputLn("Welcome to the game of Blackjack");
            Display.outputLn("");
        }

        private void displayPlayers() {
            Display.outputLn("Players playing the game: ");
            for (int i = 0; i < blackjackPlayers.size(); i++) {
                Display.outputLn(blackjackPlayers.get(i).getCardPlayerName());
            }
            Display.outputLn("");
        }

        private void displayPlayersHands(String s){
            Display.outputLn(s +"'s hand: ");
        }

        private void displayCardCount(){

            Display.outputLn("Card " + count+ ": ");
        }
    }
}

