package io.royale7.casino;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileStorage implements Storage {

    public void loadPlayersInformation() {
        return;
    }

    public void savePlayersInformation() {
        return;
    }

    public void testMethod(){
        ObjectMapper mapper = new ObjectMapper();
        Player player = new Player();
        try {
            mapper.writeValue(new File("test.json"), player);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
