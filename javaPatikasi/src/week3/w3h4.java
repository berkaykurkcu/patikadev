package week3;

import java.util.Scanner;

public class w3h4 {
    public static void main(String[] args) {
        System.out.println("Asal sayıları yazdır");
        int counter = 0;
        for(int i = 2; i <= 100; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    counter++;
                    break;
                }
            }
            if(counter == 0){
                System.out.println(i + " ");
            }
            counter = 0;
        }
    }
}
