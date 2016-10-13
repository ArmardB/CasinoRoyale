package io.royale7.casino;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static int promptInt(){
        return sc.nextInt();
    }

    public static double promptDouble(){
        return sc.nextDouble();
    }

    public static String promptString(){
        return sc.next();
    }
}
