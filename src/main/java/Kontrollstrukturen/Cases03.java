package Kontrollstrukturen;

import java.util.Scanner;

public class Cases03 {
    static String firstName;
    static String lastName;
    static int age;
    static char gender;

    public static void main(String[] args){
        getInputs();
        System.out.println(produceGreeting(firstName, lastName, age, gender));
    }

    public static void getInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gib deinen Vor- und Nachnamen ein: ");
        firstName = sc.next();
        lastName =sc.next();
        System.out.print("Bitte gib dein Alter ein: ");
        age = sc.nextInt();
        System.out.print("Bitte gib dein Geschlecht ein (m, f, d): ");
        sc.nextLine();
        gender = sc.nextLine().charAt(0);
    }
    public static String produceGreeting(String firstName, String lastName, int age, char gender){
        String greeting;
        if (gender == 'd' || age < 18){
            greeting = "Hallo, " + firstName;
        } else if (gender == 'm'){
            greeting = "Hallo, Herr " + lastName;
        } else if (gender == 'f'){
            greeting = "Hallo, Frau " + lastName;
        } else {
            greeting = "Bitte überprüfen Sie Ihre Eingaben";
        }
        return greeting;
    }
}
