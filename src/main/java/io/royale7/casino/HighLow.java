package io.royale7.casino;

import java.util.List;
import java.util.*;


public class HighLow extends CardGames {

    public HighLowDisplay highLowDisplay = new HighLowDisplay();
    public List<Card> cardsOnTable = new ArrayList<>();
    private List<CardPlayer> highLowPlayers;
    private boolean playAgain = true;
    Deck deck;


    public HighLow(List<Player> player) {
        super(player);
        this.highLowPlayers = super.cardPlayers;
    }

    public void init() {
        highLowDisplay.displayMessage();
        playGame();
    }

    public void playGame() {
        while (playAgain) {
            deck = new Deck();
            shuffleDeck();
            addCardToTable();
            removeCardFromDeck();
            showCard(cardsOnTable.get(0));
            Display.outputLn("Will the next card be [H]igher or [L]ower..?");
            String userResponse = UserInput.promptString().toLowerCase();
            determineWinner(userResponse);
        }
    }

    void shuffleDeck(){
        Collections.shuffle(deck.cards);

    }

    void addCardToTable(){
        cardsOnTable.add(deck.cards.get(0));
    }


    void removeCardFromDeck(){
        deck.cards.remove(0);
    }


    void showCard(Card card){
        Display.outputLn(card.getRank()+ " of " + card.getSuit());
    }

    void checkIfGuessIsHigher(){
        if ((cardsOnTable.get(cardsOnTable.size()-1)).getRank().getCardValue() > (cardsOnTable.get(cardsOnTable.size()-2)).getRank().getCardValue()){
            Display.outputLn("YOU WON");
        }else {
           checkIfPlayerWantsToPlayAgain();
        }
    }

    void checkIfGuessIsLower(){
        if ((cardsOnTable.get(cardsOnTable.size()-1)).getRank().getCardValue() < (cardsOnTable.get(cardsOnTable.size()-2)).getRank().getCardValue()){
            Display.outputLn("YOU WON");
        }else {
            checkIfPlayerWantsToPlayAgain();
        }
    }

    void checkIfPlayerWantsToPlayAgain(){
        Display.outputLn("SORRY YOU LOST");
        Display.outputLn("Play again? [Y]es or [N]o");
        String playAgainInput = UserInput.promptString().toLowerCase();
        if(playAgainInput.equals("y")){
            playAgain = true;

        }else {
            playAgain= false;
        }
    }

    void determineWinner(String string){
        switch(string){
            case "h":
                addCardToTable();
                removeCardFromDeck();
                showCard(cardsOnTable.get(cardsOnTable.size()-1));
                checkIfGuessIsHigher();
                break;
            case "l":
                addCardToTable();
                removeCardFromDeck();
                showCard(cardsOnTable.get(cardsOnTable.size()-1));
                checkIfGuessIsLower();
                break;
            default:
                Display.outputLn("Incorrect input. Please enter an 'H' or 'L'");
        }
    }

    private class HighLowDisplay extends Display {

        private void displayMessage(){
            outputLn("Welcome to the game of Hi-Low");
        }

        private void displayBet(){
            outputLn("How much do you want to bet?");
        }


    }

}
