package Kontrollstrukturen;

import java.util.Scanner;

public class cases06 {
    static Scanner sc = new Scanner(System.in);
    static String lastName;
    static String gender;

    public static void main(String[] args){
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        lastName = sc.next();
        System.out.print("Bitte geben Sie Ihr Geschlecht ein: ");
        gender = sc.next();

        switch (gender){
            case "f" :
            case "female" :
                System.out.println("Hallo Frau " + lastName);
            break;
            case "m" :
            case "male" :
                System.out.println("Hallo Herr " + lastName);
                break;
        }


    }
}
