package io.royale7.casino;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


public class StorageTest {

    @Test
    public void savePlayersInformationTest(){
        FileStorage fileStorage = new FileStorage();
        Player player = new Player("Naz", "PizzaFace");
        fileStorage.savePlayersInformation(player);

    }
}
