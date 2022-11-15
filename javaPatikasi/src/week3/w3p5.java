package week3;

import java.util.Scanner;

public class w3p5 {
    public static void main(String[] args) {
        System.out.println("Calculate power");
        int k,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter bottom number");
        k = scan.nextInt();
        System.out.println("Enter power");
        n  = scan.nextInt();
        int result = (int) Math.pow(k,n);
        int result2=1;
        System.out.println("Result is: " + result);
        for(int i = 0; i < n; i++){
            result2 = result2 * k;
        }
        System.out.println("Result2: " +result2);
    }
}
