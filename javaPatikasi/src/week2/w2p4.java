package week2;

import java.util.Scanner;

public class w2p4 {
    public static void main(String[] args) {
        System.out.println("Hava durumuna göre etkinlik önerme");
        int heat;
        Scanner scan = new Scanner(System.in);
        heat = scan.nextInt();
        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        }else if (heat >= 5 && heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else if(heat > 25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
