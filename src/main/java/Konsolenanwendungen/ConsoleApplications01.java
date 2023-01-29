package Konsolenanwendungen;

import java.util.Scanner;

public class ConsoleApplications01 {
    public static void main(String[] args) {
        System.out.println("Bitte gib zwei ganze Zahlen ein: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
