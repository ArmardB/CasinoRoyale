package io.royale7.casino;

import org.junit.Before;
import org.junit.Test;

public class SlotsTest {
    Slots s;

    @Before
    public void init() {
        Engine engine = new Engine();
        s = new Slots(engine.getLoggedInPlayersContainer());
    }

    @Test
    public void setupTest() {

    }

}
