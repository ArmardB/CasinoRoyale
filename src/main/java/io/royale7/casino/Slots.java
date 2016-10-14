package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class Slots extends LuckGames {

    private SlotsDisplay display;
    private Player player;

    private boolean running;
    private String inputString;
    private String outputString;
    private String[] slotsValues;
    private int winAmount;

    private List<Player> slotPlayers = new ArrayList<>();

    public Slots(List<Player> players){
        super(players);
        this.slotPlayers = super.luckPlayers;
    }

    public boolean isRunning() { return running; }

    public void init() {
        Display.outputLn("Slots");
    }

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
