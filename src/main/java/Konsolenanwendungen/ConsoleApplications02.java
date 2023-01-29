package Konsolenanwendungen;

import java.util.Scanner;

public class ConsoleApplications02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte geben Sie zwei Ganzzahlen ein: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double result = (double)num1 / (double)num2 * 100;

        System.out.println(num1 + " = " + result + "% von " + num2);
    }
}
