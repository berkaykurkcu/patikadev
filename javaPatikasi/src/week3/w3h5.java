package week3;

import java.util.Scanner;

public class w3h5 {
    public static void main(String[] args) {
        System.out.println("Üslü sayı hesaplayan program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter bottom digit: ");
        int bottom = scan.nextInt();
        System.out.println("Enter power: ");
        int power = scan.nextInt();
        int result = 1;
        for(int i = 1; i<= power; i++){
            result *= bottom;
        }
        System.out.println("Result: " +result);
    }
}
