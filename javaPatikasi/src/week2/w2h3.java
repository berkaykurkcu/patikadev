package week2;

import java.util.Scanner;

public class w2h3 {
    public static void main(String[] args) {
        System.out.println("Week 2 Homework 3");
        System.out.println("Yıl giriniz");
        int yil;
        Scanner scan = new Scanner(System.in);
        yil = scan.nextInt();
        if ((yil % 4 == 0) && (yil % 100 != 0)) {
            System.out.println(yil + " is a leap year.");
        } else if ((yil % 100 == 0) && (yil % 400 == 0)) {
            System.out.println(yil + " is a leap year.");
        } else {
            System.out.println(yil + " is not a leap year.");
        }
    }
}
