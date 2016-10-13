package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carinablair on 10/13/16.
 */
public abstract class LuckGame extends Game {

    protected List<Player> players = new ArrayList<>();

    public LuckGame(){
        this.players = super.setPlayersContainer;
    }

    @Override
    public void settle() {

    }

    @Override
    public void bet() {

    }

    public abstract void init();

}
