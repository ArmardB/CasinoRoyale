package io.royale7.casino;

/**
 * Created by robertodedeus on 10/12/16.
 */
public class Engine {

    PlayerManager playerManager;
    GameManager gameManager;

   
    Engine() {
        playerManager = new PlayerManager();
        gameManager = new GameManager();
    }

<<<<<<< HEAD
    protected Player login(int userID, String password) throws NullPointerException{
        return null;
    }

    protected Player getDefaultUser(){
        return null;
    }

    protected Player createNewUser(String name, String password){
=======
    protected Player login(int playerID, String password) throws NullPointerException{
        return null;
    }

    protected Player getDefaultPlayer(){
        return null;
    }

    protected Player createDefaultPlayer(String name, String password){
>>>>>>> 8266d196dc8bc60bafd62daeb8a1ec143233a4c5
        return null;
    }

    protected Game play(int gameID) {
        return null;
    }

    protected void exit() {
        
    }


}
