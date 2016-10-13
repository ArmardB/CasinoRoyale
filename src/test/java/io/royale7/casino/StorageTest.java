package io.royale7.casino;

import org.junit.Test;


public class StorageTest {

    @Test
    public void savePlayersInformationTest(){
        FileStorage fileStorage = new FileStorage();
        Player player = new Player("Naz", "PizzaFace");
        fileStorage.savePlayersInformation();

    }
}
