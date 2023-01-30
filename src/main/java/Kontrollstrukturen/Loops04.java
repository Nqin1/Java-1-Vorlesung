package Kontrollstrukturen;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib bitte deine erste Zeichenkette ein: ");
        String string1 = sc.nextLine().toUpperCase();
        System.out.print("Gib bitte deine zweite Zeichenkette ein: ");
        String string2 = sc.nextLine().toUpperCase();

        boolean isEqual = false;

        if (string1.length() == string2.length()){
            isEqual = true;
            for ( int i = 0; i < string1.length(); i++ ){
                if (string1.charAt(i) != string2.charAt(i)){
                    isEqual = false;
                }
            }
        }

        if (isEqual == true){
            System.out.println("Die beiden Zeichenketten sind gleich");
        } else if (!isEqual){
            System.out.println("Die beiden Zeichenketten sind nicht gleich");
        }

    }
}
