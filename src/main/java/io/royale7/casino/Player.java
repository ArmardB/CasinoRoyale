package io.royale7.casino;

/**
 * Created by robertodedeus on 10/12/16.
 */
public class Player {
    private int id;
    private String name;
    private String password;
    private String accountBalance;

    protected Double getAccountBalance(double amount){
        return 0.0;
    }

    protected Double setAccountBalance(double amount){
        return 0.0;
    }
}
