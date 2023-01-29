package Kontrollstrukturen;

import java.util.Scanner;

public class Cases02 {
    static int num1;
    static int num2;
    static String opr;

    public static void main(String[] args){
        getInputs();
        System.out.println(num1 + " " + opr + " " + num2 + " " + " = " + performCalculations(num1, opr, num2));
    }

    public static void getInputs(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gib den ersten Operanden ein: ");
        num1 = sc.nextInt();
        System.out.print("Bitte gib den Opeator ein: ");
        opr = sc.next();
        System.out.print("Bitte gib den zweiten Operanden ein: ");
        num2 = sc.nextInt();
    }
    public static int performCalculations(int num1, String opr, int num2){
        int result;
        if (opr.equals("+")){
            result = num1 + num2;
        } else if (opr.equals("-")) {
            result = num1 - num2;
        } else if (opr.equals("*")){
            result = num1 * num2;
        } else if (opr.equals("/")){
            result = num1 / num2;
        } else {
            System.out.println("Please use a different operator");
            result = 0;
        }
        return result;
    }
}
