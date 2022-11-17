package week3;

import java.util.Arrays;
import java.util.Scanner;

public class w3h1 {
    public static void main(String[] args) {
        System.out.println("N adet sayma sayısının en küçüğünü en büyüğünü bulma");
        Scanner scan = new Scanner(System.in);
        int biggest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        System.out.println("Kaç tane sayı gireceksiniz?");
        int count = scan.nextInt();
        int[] liste = new int[count];
        for(int i = 0;i<count;i++){
            System.out.println((i+1) +". sayıyı giriniz");
            liste[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(liste));
        for(int j=0; j<liste.length;j++){
            for(int k=0; k<liste.length;k++){
                if(liste[j] < liste[k]){
                    System.out.println(liste[j] + " is smaller than " + liste[k]);
                    if(smallest>liste[j]){
                        smallest = liste[j];
                    }
                }else if(liste[j] == liste[k]){
                    System.out.println(liste[j] + " is equal to " +liste[k]);
                }else{
                System.out.println(liste[j] + " is bigger than " + liste[k]);
                biggest = liste[j];
                if(biggest<liste[j]){
                    biggest = liste[j];
                }
                }
            }
        }
        System.out.println("Biggest: " + biggest + " smallest: " + smallest);
    }
}
