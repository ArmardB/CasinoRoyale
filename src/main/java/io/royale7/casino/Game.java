package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    private int gameID;
    List<Player> loggedInUsersContainer;


    public void init(){

    }

    public void setLoggedInUsersContainer(List<Player> loggedInUsersContainer){
        this.loggedInUsersContainer = loggedInUsersContainer;
    }

}
