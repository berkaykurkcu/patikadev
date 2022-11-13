package week1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        double boy,kilo,total;
        System.out.println("Vücut kitle endeksi hesaplayan program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz:");
        boy = scan.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        kilo = scan.nextDouble();
        total = kilo / (boy*boy);
        System.out.println(total);
    }
}
