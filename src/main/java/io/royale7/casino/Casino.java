package io.royale7.casino;

/**
 * Created by robertodedeus on 10/12/16.
 */
public class Casino {
    private Engine engine;
    private User user;
    private User invalidUser;
    private Game game;

    Casino(){
        engine = new Engine();
        invalidUser = engine.getDefaultUser();
        user = invalidUser;
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
        Display.outputLn("Please enter user your ID: ");
        int userID = UserInput.promptInt();
        Display.outputLn("Please enter your password: ");
        String userPassword = UserInput.promptString();
        loginMenuAction(userID, userPassword);
    }

    private void loginMenuAction(int userID, String userPassword){
        try{
            user = engine.login(userID, userPassword);
        } catch (NullPointerException e){
            user = invalidUser;
        }

        if(user == invalidUser){
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
        engine.createNewUser(name, password);
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
        user.setAccountBalance(amount);
        loungeMenu();
    }

    private void playRoomMenu(){
        Display.playRoomMenu();
        playRoomMenuAction(UserInput.promptInt());
    }

    private void playRoomMenuAction(int playRoomMenuSelection){
        switch (playRoomMenuSelection){
            // todo: get list of available games and display a case for each
            // todo: provide a way for the user to return to the lounge
            default:
                Display.invalidSelection();
                loungeMenu();
                break;
        }
    }

    private void logOutMenu(){
        Display.logOutMenu();
        logOutMenuAction();
    }

    private void logOutMenuAction(){
        user = invalidUser;
        mainMenu();
    }

}
