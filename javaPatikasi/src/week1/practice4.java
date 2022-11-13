import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        System.out.println("Taksiye hoşgeldiniz");
        double acilisUcreti = 10,kmBasinUcret = 2.20,totalUcret,km;
        Scanner scan = new Scanner(System.in);
        System.out.println("Total KM giriniz:");
        km = scan.nextDouble();
        totalUcret = acilisUcreti + kmBasinUcret * km;
        if(totalUcret<=20.0){
            System.out.println("Ücretiniz: " +totalUcret +"\n Minimum ücret olan 20TL 'yi ödemelisiniz.");
        }else{
            System.out.println("Ücretiniz:" + totalUcret);
        }
    }
}
