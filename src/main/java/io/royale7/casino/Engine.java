package io.royale7.casino;

/**
 * Created by robertodedeus on 10/12/16.
 */
public class Engine {

    UserManager userManager;
    GameManager gameManager;

   
    Engine() {
        userManager = new UserManager();
        gameManager = new GameManager();
    }

    protected Player login(int userID, String password) throws NullPointerException{
        return null;
    }

    protected Player getDefaultUser(){
        return null;
    }

    protected Player createNewUser(String name, String password){
        return null;
    }

    protected Game play(int gameID) {
        return null;
    }

    protected void exit() {
        
    }


}
