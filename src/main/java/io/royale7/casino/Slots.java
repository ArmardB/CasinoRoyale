package io.royale7.casino;

import java.util.List;

public class Slots extends Game {

    private SlotsDisplay display;
    private Player player;

<<<<<<< Updated upstream
=======
import java.util.List;

public class Slots extends Game {

    private SlotsDisplay display;
    private Player player;

>>>>>>> Stashed changes
    private boolean running;
    private String inputString;
    private String outputString;
    private String[] slotsValues;
    private int winAmount;

    public Slots() {

    }

    public boolean isRunning() { return running; }

    public void init(List<Player> playerList) { return; }

    public void gameLoop() { return; }

    public void playSlots() { return; }

    private String getRandomSlotValue() { return null; }

    private String getSlotsValue(int index) { return null; }

    public int determineWinnings() { return 0; }

    public void quit() { return; }

    private class SlotsDisplay extends Display {
        private String welcomeMenu =
                "Welcome my son to Slooooooooooooooooooooots. What do?\n" +
                "[1] Play\n" +
                "[2] Quit\n";
        private String userInfo =
                player.getName() + "\n" +
                player.getAccountBalance();
    }
}
