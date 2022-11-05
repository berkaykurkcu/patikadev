import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int math,turkce,fizik,kimya,biyoloji;
        System.out.println("Math: ");
        math = scan.nextInt();
        System.out.println("Turkce: ");
        turkce = scan.nextInt();
        System.out.println("Fizik:" );
        fizik = scan.nextInt();
        System.out.println("Kimya");
        kimya = scan.nextInt();
        System.out.println("Biyoloji");
        biyoloji = scan.nextInt();
        int sonuc = (math + turkce + fizik + kimya + biyoloji) / 5;
        System.out.println("Total: ");
        System.out.println(sonuc >= 60 ? "Geçti" : "Kaldı");
        }
    }