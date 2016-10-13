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
        this.password = "hunter2";
        id = idCounter++;
        this.accountBalance = 0;
    }

    /** Official notice:
     * Dear Sir, Madam, or other non-binary gender non-conforming patrons of this knowledge source,
     *
     *      We ask that you please restrict usage of this function/method for purely test-based purposes,
     *      and under no other circumstances make calls to the below listed Java snippet.
     *
     *      Thank you for your patience and understanding,
     *      Jonathan Michael Leczner & Nazhir Martese Jackson
     */
    protected static void resetIdCounter() { idCounter = 1; }

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

    @Override
    public String toString() {
        return "Id: " + this.id + "\n Username: " + this.name + "\n Password: " + this.password;
    }
}
