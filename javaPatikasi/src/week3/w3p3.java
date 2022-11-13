package week3;

import java.util.Scanner;

public class w3p3 {
    public static void main(String[] args) {
        System.out.println("display 4^n and 5^n up to the input number");
        int k;
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        for(int i = 1; i <= k; i*=4){
          System.out.println("Powers of 4 up until " + k);
          System.out.println(i); 
      }

        for(int j = 1; j <= k; j*=5){
            System.out.println("Powers of 5 up until " + k);
            System.out.println(j);
        }
    }
  }

