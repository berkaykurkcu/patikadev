package week1;

import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        System.out.println("Hipotenüs hesaplama");
        int a,b;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.println("A kenarını giriniz: ");
        a = scan.nextInt();
        System.out.println("B kenarını giriniz: ");
        b = scan.nextInt();
        c = a*a + b*b;
        c = Math.sqrt(c);
        System.out.println("Hipotenüs: " + c );
    }
}
