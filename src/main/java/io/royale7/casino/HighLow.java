package io.royale7.casino;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.tools.corba.se.idl.InvalidCharacter;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created by armardbellamy on 10/12/16.
 */
public class HighLow {

    private Deck deck;
    private Boolean isRunning = true;

    public void init(){
        while(isRunning){
            
        }
    }



    public Card dealACard(){
        return deck.cards.get(0);
    }

    public Boolean playAgain () throws InvalidCharacter {
        Display.outputLn("Game over!!!!");
        Display.outputLn("Would you like to play again [Y]es or [N]o...?");
        String userAnswer = UserInput.promptString().toLowerCase();


        if (userAnswer.equals("n")) {
            // Settle account then exit to game room
            return false;
        } else if (userAnswer.equals("y")) {
            // keep playing
            return true;
        }

    }




}
