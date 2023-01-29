package Kontrollstrukturen;

import java.util.Scanner;

public class Cases01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gib eine ganze Zahl ein: ");
        int num1 = sc.nextInt();

        if ( num1 % 2 == 0){
            System.out.println("Es handelt sich um eine ganze Zahl");
        } else {
            System.out.println("Es handelt sich um eine ungerade Zahl");
        }
    }
}
