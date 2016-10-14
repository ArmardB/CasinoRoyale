package io.royale7.casino;



public class Craps extends LuckGames {

    private CrapsDisplay crapsDisplay = new CrapsDisplay();
    UserInput input = new UserInput();
    private boolean hasPlayerWon = false;
    private boolean hasPlayerLost = false;
    private boolean playAgain = true;
    private int point;


    public void init(){
        crapsDisplay.displayPlayerSize();
        playGame();
    }

    //Using default implementations of bet() and settle() from the LuckGame class


    int rollDice(){
        int num1 = (int)(Math.random()*10)%6+1;
        int num2 = (int)(Math.random()*10)%6+1;
        crapsDisplay.displayDice(num1, num2);
        return num1 + num2;
    }





    private void playGame(){

        while(playAgain){
            int diceValue = rollDice();

            if(checkIfPlayerWinsOnTheFirstRoll(diceValue))
                crapsDisplay.displayIfPlayerWantsToPlayAgain();
            else if(checkIfPlayerLosesOnTheFirstRoll(diceValue))
                crapsDisplay.displayPlayerLoses();
            else {
                point = diceValue;
                do{
                    diceValue = rollDice();

                }while((diceValue != point) && (diceValue != 7));

                if(checkIfNextRollOfDiceEqualsPoint(diceValue))
                    crapsDisplay.displayPlayerWins();
                else if(checkIfNextRollOfDiceEqualsSeven(diceValue))
                    crapsDisplay.displayPlayerLoses();
            }

            playAgain = checkIfPlayerWantsToPlayAgain();
        }

    }


    boolean checkIfNextRollOfDiceEqualsPoint(int diceValue){
        hasPlayerWon = false;
        if (diceValue == point){
            hasPlayerWon = true;
        }
        return hasPlayerWon;
    }


    boolean checkIfNextRollOfDiceEqualsSeven(int diceValue){
        hasPlayerLost = false;
        if (diceValue == 7)
            hasPlayerLost = true;
        return hasPlayerLost;
    }


    boolean checkIfPlayerWantsToPlayAgain(){
        playAgain = false;
        crapsDisplay.displayIfPlayerWantsToPlayAgain();

        int yesOrNoInput = UserInput.promptInt();
        if (yesOrNoInput == 1)
            playAgain = true;
        return playAgain;
    }

     boolean checkIfPlayerWinsOnTheFirstRoll(int diceValue){
         hasPlayerWon =false;
        if (diceValue == 7 || diceValue ==11){
            hasPlayerWon = true;
            crapsDisplay.displayPlayerWins();

        }
        return hasPlayerWon;
    }


     boolean checkIfPlayerLosesOnTheFirstRoll(int diceValue){
        if (diceValue == 2 || diceValue == 3 || diceValue == 12){
            hasPlayerLost = true;
            crapsDisplay.displayPlayerLoses();
        }
        return hasPlayerLost;
    }



    private class CrapsDisplay extends Display{
        private void displayPlayerWins(){
            outputLn("Player Wins!!");
        }
        private void displayIfPlayerWantsToPlayAgain(){
            outputLn("Do you want to play Craps again??");
            outputLn("1.Yes\n2.No\n");

        }

        private void displayPlayerLoses(){
            outputLn("Player Loses!!");
        }

        private void displayDice(int num1, int num2){
            outputLn("Dice roll result: "+num1+ " and " +num2);
        }

        private void displayPlayerSize(){
            outputLn("Player " +players.get(0)+ " is playing the game" );
        }

    }


}
