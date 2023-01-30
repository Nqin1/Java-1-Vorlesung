package Kontrollstrukturen;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib bitte eine Zeichenkette ein: ");
        String string = sc.nextLine();
        System.out.print("Gib bitte das zu analysierende Zeichen ein: ");
        String character = sc.next();

        double abs = 0;                                                         // Frage: Warum funktioniert das Ausrechnen des prozentualen Anteils nur, wenn abs von Anfang an
        double perc;                                                            // vom Typ double ist? Sollte das nicht impliziertes Casten sein?

        for ( int i = 0; i < string.length(); i++){
            if (string.charAt(i) == character.charAt(0)){
                abs++;
            }
        }
        System.out.println("absolute Häufigkeit: " + abs);
        perc = abs / string.length() * 100;
        System.out.println("prozentale Häufigkeit: " + perc + "%");
    }
}
