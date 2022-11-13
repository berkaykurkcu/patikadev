package week3;

import java.util.Scanner;

public class w3p2 {
    public static void main(String[] args) {
        System.out.println("Add odd values and print a total sum up until a negative number is entered");
        Scanner scan = new Scanner(System.in);
        int k = 0;
        int sum = 0;
        do {
            System.out.println("Enter a number: ");
            k = scan.nextInt();
            if(k%2==1){
                sum = k + sum;
                System.out.println("Sum: " + sum);
            }else if(k%2==0){
                System.out.println("K is not odd");
            }else
                System.out.println("Exiting program.");
        }
        while(k>0);
    }
}
