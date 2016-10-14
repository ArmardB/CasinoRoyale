package io.royale7.casino;

public class Blackjack extends CardGames{

    BlackJackDisplay blackJackDisplay = new BlackJackDisplay();






    public void init(){
        blackJackDisplay.displayWelcomeMessage();
    }





    public class BlackJackDisplay{
        public void displayWelcomeMessage(){
            Display.outputLn("Welcome to the game of BlackJack");
        }
    }

}
