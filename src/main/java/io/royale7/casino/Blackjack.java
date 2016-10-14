package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Blackjack extends CardGames {

    private BlackJackDisplay blackJackDisplay = new BlackJackDisplay();
    private List<CardPlayer> blackjackPlayers = new ArrayList<>();
    private Map<CardPlayer, List<Card>> blackjackPlayerHands;

    public Blackjack(List<Player> players) {
        super(players);
        this.blackjackPlayers = super.cardPlayers;
    }


    public void init() {
        blackJackDisplay.displayWelcomeMessage();
        blackJackDisplay.displayPlayers();
        playGame();
    }


    public void playGame() {
        blackjackPlayerHands = deal(2);
        showHands();
    }


    public void showHands() {
        for (CardPlayer key : blackjackPlayerHands.keySet()) {
            Display.outputLn(key.getCardPlayerName());

            List<Card> hand = blackjackPlayerHands.get(key);
            for (Card card : hand) {
                Display.outputLn(card.getRank() + " of " + card.getSuit());
            }
        }

    }


    private class BlackJackDisplay {

        public void displayWelcomeMessage() {
            Display.outputLn("Welcome to the game of Blackjack");
        }


        private void displayPlayers() {
            Display.outputLn("Players playing the game: ");
            for (int i = 0; i < blackjackPlayers.size(); i++) {
                Display.outputLn(blackjackPlayers.get(i).getCardPlayerName());
            }
        }


    }


}

