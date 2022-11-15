package week3;

import java.util.Scanner;

public class w3p8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i = 0; i<= input; i ++){
            for(int j = 0; j < (input - i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i=input-1; i>=1; i--){
            for (int k=input; k>i; k--){
                System.out.print(" ");
            }
            for (int l=1; l<=(2*i-1); l++){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
