package week3;

import java.util.Scanner;

public class w3h1 {
    public static void main(String[] args) {
        System.out.println("Perfect number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see if it is perfect or not: ");
        int number = scan.nextInt();
        int total=0;
        for(int i = 1;i<number;i++){
            if(number%i==0){
                total += i;
            }
        }
        if(number==total){
            System.out.println("Perfect!!");
        }else{
            System.out.println("Not perfect!");
        }
    }
}
