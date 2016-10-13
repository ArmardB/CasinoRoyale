package io.royale7.casino;

public class Casino {
    private Engine engine;
    private Player player;
    private Player invalidPlayer;

    private Game game;
    private Game invalidGame;

    Casino(){
        engine = new Engine();
        invalidPlayer = engine.getDefaultPlayer();
        player = invalidPlayer;
    }

    void init(){
        mainMenu();
    }

    private void mainMenu(){
        Display.welcomeMenu();
        mainMenuAction(UserInput.promptInt());
    }

    private void mainMenuAction(int mainMenuSelection){
        switch (mainMenuSelection){
            case 1:
                loginMenu();
                break;
            case 2:
                newCustomerMenu();
                break;
            default:
                Display.invalidSelection();
                mainMenu();
                break;
        }
    }

    private void loginMenu(){
        Display.loginMenu();
        Display.outputLn("Please enter` your ID: ");
        int playerID = UserInput.promptInt();
        Display.outputLn("Please enter your password: ");
        String userPassword = UserInput.promptString();
        loginMenuAction(playerID, userPassword);
    }

    private void loginMenuAction(int playerID, String playerPassword){
        try{
            player = engine.login(playerID, playerPassword);
        } catch (NullPointerException e){
            player = invalidPlayer;
        }

        if(player == invalidPlayer){
            Display.invalidUser();
            mainMenu();
        } else {
            loungeMenu();
        }
    }

    private void newCustomerMenu(){
        Display.newCustomerMenu();
        Display.outputLn("Please enter your name: ");
        String name = UserInput.promptString();
        Display.outputLn("Please choose a password: ");
        String password = UserInput.promptString();
        newCustomerMenuAction(name, password);
    }

    private void newCustomerMenuAction(String name, String password){
        player = engine.createDefaultPlayer(name, password);
        loungeMenu();
    }

    private void loungeMenu(){
        Display.loungeMenu();
        loungeMenuAction(UserInput.promptInt());
    }

    private void loungeMenuAction(int loungeMenuSelection){
        switch (loungeMenuSelection){
            case 1:
                addFundsMenu();
                break;
            case 2:
                playRoomMenu();
                break;
            case 3:
                logOutMenu();
                break;
            default:
                Display.invalidSelection();
                loungeMenu();
                break;
        }
    }

    private void addFundsMenu(){
        Display.addFundsMenu();
        addFundsMenuAction(UserInput.promptDouble());
    }

    private void addFundsMenuAction(double amount){
        player.setAccountBalance(amount);
        loungeMenu();
    }

    private void playRoomMenu(){
        Display.playRoomMenu();
        playRoomMenuAction(UserInput.promptInt());
    }

    private void playRoomMenuAction(int playRoomMenuSelection){
        try {
            game = engine.play(playRoomMenuSelection);
        } catch (NullPointerException e) {
            game = invalidGame;
        }

        if(game == null) {
            Display.invalidSelection();
            playRoomMenu();
        } else {
            game.init();
        }
    }

    private void logOutMenu(){
        Display.logOutMenu();
        logOutMenuAction();
    }

    private void logOutMenuAction(){
        player = invalidPlayer;
        mainMenu();
    }

}
