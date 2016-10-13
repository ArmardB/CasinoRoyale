package io.royale7.casino;

import java.text.NumberFormat;

public class Display {
    public static void welcomeMenu(){
        outputLn("Welcome to the casino. Please login or create an account.");
        outputLn("[1] Login");
        outputLn("[2] Create an account");
    }

    public static void loginMenu(){
        outputLn("Login Menu.");
    }

    public static void newCustomerMenu(){
        outputLn("Thank you for joining.");
    }

    public static void loungeMenu(){
        outputLn("Welcome to the lounge."); // todo: greet with user name
        outputLn("[1] Add funds");
        outputLn("[2] Go to the playroom");
        outputLn("[3] Log out");
    }

    public static void addFundsMenu(){
        outputLn("How much would you like to add to your account? ");
    }

    public static void printFormatBalance(double balance) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        outputLn(formatter.format(balance));
    }

    public static void playRoomMenu(){
        outputLn("Choose a game: ");
    }

    public static void logOutMenu(){
        outputLn("Goodbye.");
    }

    public static void invalidSelection(){
        outputLn("Invalid selection. Please try again.");
    }

    public static void invalidUser(){
        outputLn("We are sorry but you could not be logged in with the credentials provided.\n" +
                "Please verify your user ID and password and try again.");
    }

    public static void outputLn(String msg){
        System.out.println(msg);
    }
}
