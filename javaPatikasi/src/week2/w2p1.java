package week2;
import java.util.Scanner;
public class w2p1 {
    //calculator
    public static void main(String[] args) {
        System.out.println("Hesap makinesi");
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        int secim;
        System.out.println("1. sayıyı giriniz");
        n1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz");
        n2 = scan.nextInt();
        System.out.println("Ne yapmak istersiniz?");
        System.out.println("1. Toplama\n2. Çıkarma\n3.Çarpma\n4.Bölme");
        secim = scan.nextInt();
        switch (secim){
            case 1:
                System.out.println("Sonuç: " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Sonuç: " + (n1/n2));
                }else{
                    System.out.println("0'a bölüm yapılamaz");
                }
                break;
        }
    }
}