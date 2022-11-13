import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        System.out.println("Gelirinizi giriniz! Çıkmak için -1");
        int gelir = 0;
        Scanner scan = new Scanner(System.in);
        while(gelir != -1){
            gelir = scan.nextInt();
            int sonuc = gelir>=1000 ? gelir * 8/100 + gelir : gelir * 18/100 + gelir;
            System.out.println(gelir == -1 ? "Çıkış yapılıyor." : "KDV: " + sonuc);
        }
    }
}
