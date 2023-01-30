package Kontrollstrukturen;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        System.out.print("Bitte gib eine ganze Zahl ein: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                result = false;
            }
        }
        if (result == false){
            System.out.println("Deine Nummer ist keine Primzahl");
        } else {
            System.out.println("Deine Nummer ist eine Primzahl");
        }
    }
}
