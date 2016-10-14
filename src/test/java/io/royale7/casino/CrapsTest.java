package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanielholloway on 10/13/16.
 * Class to test the roll dice method
 */
public class CrapsTest {

    @Test
    public void rollDiceTest(){
        List<Player> crapsPlayerList = new ArrayList<>();
        crapsPlayerList.add(new Player("Nate", "1234"));
        Craps craps = new Craps(crapsPlayerList);
        int actual = craps.rollDice();
        Assert.assertTrue(actual>1 && actual<13);
    }

    @Test
    public void checkIfPlayerWinsOnTheFirstRollOf7Test(){
        List<Player> crapsPlayerList = new ArrayList<>();
        crapsPlayerList.add(new Player("Nate", "1234"));
        Craps craps = new Craps(crapsPlayerList);
        boolean actualOutput = craps.checkIfPlayerWinsOnTheFirstRoll(7);
        Assert.assertTrue(actualOutput);

    }


    @Test
    public void checkIfPlayerWinsOnTheFirstRollOf11Test(){
        List<Player> crapsPlayerList = new ArrayList<>();
        crapsPlayerList.add(new Player("Nate", "1234"));
        Craps craps = new Craps(crapsPlayerList);
        boolean actualOutput = craps.checkIfPlayerWinsOnTheFirstRoll(11);
        Assert.assertTrue(actualOutput);

    }

    @Test
    public void checkIfPlayerLosesOnTheFirstRollOf12Test(){
        List<Player> crapsPlayerList = new ArrayList<>();
        crapsPlayerList.add(new Player("Nate", "1234"));
        Craps craps = new Craps(crapsPlayerList);
        boolean actualOutput = craps.checkIfPlayerLosesOnTheFirstRoll(12);
        Assert.assertTrue(actualOutput);

    }



    @Test
    public void checkIfPlayerLosesOnTheFirstRollOf2Test(){
        List<Player> crapsPlayerList = new ArrayList<>();
        crapsPlayerList.add(new Player("Nate", "1234"));
        Craps craps = new Craps(crapsPlayerList);
        boolean actualOutput = craps.checkIfPlayerLosesOnTheFirstRoll(2);
        Assert.assertTrue(actualOutput);

    }


    @Test
    public void checkIfPlayerLosesOnTheFirstRollOf3Test(){
        List<Player> crapsPlayerList = new ArrayList<>();
        crapsPlayerList.add(new Player("Nate", "1234"));
        Craps craps = new Craps(crapsPlayerList);
        boolean actualOutput = craps.checkIfPlayerLosesOnTheFirstRoll(3);
        Assert.assertTrue(actualOutput);

    }



//    @Test
//    public void checkIfPlayerWantsToPlayAgainTest(){
//        List<Player> crapsPlayerList = new ArrayList<>();
//        crapsPlayerList.add(new Player("Nate", "1234"));
//        Craps craps = new Craps(crapsPlayerList);
//        boolean answer = craps.checkIfPlayerWantsToPlayAgain();
//        Assert.assertTrue(answer);
//    }



}
