package org.example; //DO NOT DELETE
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of gallons: ");
        int gallons = scan.nextInt();

        System.out.println("In " + gallons + " gallons there are: ");
        System.out.println("" + gallons*4.0 + " quarts");
        System.out.println("" + gallons*8.0 + " pints");
        System.out.println("" + gallons*16.0 + " cups");
        System.out.println("" + gallons *256.0 + " tablespoons");
    }



}