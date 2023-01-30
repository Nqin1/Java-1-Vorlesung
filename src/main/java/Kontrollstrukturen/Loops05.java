package Kontrollstrukturen;

import java.util.Random;
import java.util.Scanner;

public class Loops05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int guess;
        boolean wantsToPlay = true;
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(1, 2);
        int numberOfGuesses = 0;


        while (wantsToPlay == true){
            System.out.print("Bitte gib deine Zahl ein: ");
            guess = sc.nextInt();
            numberOfGuesses++;
            if (guess == randomNumber){
                System.out.println("Glückwunsch! Du hast " + numberOfGuesses + " Versuche gebraucht" );
                wantsToPlay = false;
                break;
            }else {
                System.out.print("Leider falsch, willst du es erneut versuchen? (true, false): ");
                wantsToPlay = sc.nextBoolean();
            }
        }
    }
}
