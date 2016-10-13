package io.royale7.casino;

/**
 * Created by jonathanleczner on 10/12/16.
 */
public class Player {
    private int id;
    private static int idCounter = 0;
    private String name;
    private String password;
    private double accountBalance;

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
        id = idCounter++;
        accountBalance = 0;
    }

    public Player(){
        this.name = "Dealer";
        this.accountBalance = 0;
    }

    protected int getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    protected String getPassword() {
        return password;
    }

    protected double getAccountBalance() {
        return accountBalance;
    }

    protected void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
