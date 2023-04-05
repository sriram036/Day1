package com.bridgelabz;
import java.util.Scanner;

public class DisplayAMessage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Something here: ");
        String something = s.nextLine();
        System.out.println(something);
    }
}
