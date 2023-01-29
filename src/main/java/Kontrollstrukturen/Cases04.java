package Kontrollstrukturen;

import java.util.Random;
import java.util.Scanner;

public class Cases04 {
    static int num1;
    static int num2;
    static String winner;
    static Random random = new Random();
    static int randomNumber = random.nextInt(100) + 1;
    static int[] differences = new int[2];


    public static void main(String[] args){
        getInputs();
        calculateDifference(num1, num2, randomNumber);
        calculateWinner(differences);
        printResults();
    }


    public static void getInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Spieler 1, gib deine Zahl ein: ");
        num1 = sc.nextInt();
        System.out.print("Spieler 2, gib deine Zahl ein: ");
        num2 = sc.nextInt();
    }

    public static int[] calculateDifference(int num1, int num2, int randomNumber){
        differences[0] = Math.abs(randomNumber - num1);
        differences[1] = Math.abs(randomNumber - num2);
        return differences;
    }

    public static String calculateWinner(int[] differences){

        int difference1 = differences[0];
        int difference2 = differences[1];

        if ( difference1 < difference2 ){
            winner = "Spieler 1";
        } else if ( difference1 > difference2 ){
            winner = "Spieler 2";
        } else {
            winner = "nicht vorhanden. Es ist unentschieden!";
        }
        return winner;
    }

    public static void printResults(){
        System.out.println();
        System.out.println("Die Zufallszahl beträgt " + randomNumber);
        System.out.println("Spieler 1 hat die Zahl " + num1 + " gewählt und sein Abstand beträgt " + differences[0]);
        System.out.println("Spieler 2 hat die Zahl " + num2 + " gewählt und sein Abstand beträgt " + differences[1]);
        System.out.println("Der Gewinner ist folglich: " + winner);
    }
}
