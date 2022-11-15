package week3;

import java.util.Scanner;

public class w3p7 {
    public static void main(String[] args) {
        System.out.println("Harmonic series");
        int ustSayi = 1;
        int altSayi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Alt sayiyi giriniz: ");
        altSayi = scan.nextInt();
        double result=0.0;
        for(double i = 1; i<= altSayi; i++){
            System.out.println("Harmonic series loop");
            System.out.println("1/"+i);
            result = result + 1/i;
            System.out.println(result);
        }
    }
}
