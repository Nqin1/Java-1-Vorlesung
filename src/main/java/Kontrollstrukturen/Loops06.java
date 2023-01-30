package Kontrollstrukturen;

import java.util.Scanner;

public class Loops06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean wantsToCalculate = true;
        double capital;
        double interestRate;


        while (wantsToCalculate = true){
            System.out.print("Bitte gib dein Startkapital ein: ");
            capital = sc.nextDouble();
            System.out.print("Bitte gib den Zinssatz ein: ");
            interestRate = sc.nextDouble();
            System.out.println(calculateYearlyInterest(capital, interestRate));
            System.out.print("Willst du nochmal rechnen? (true, false): ");
            wantsToCalculate = sc.nextBoolean();                                        // Warum bricht die Loop nicht ab, wenn wantsToCalculate auf false gesetzt wird?
        }
    }
    public static double calculateYearlyInterest(double capital, double interestRate){
        return capital * (interestRate / 100);
    }
}
