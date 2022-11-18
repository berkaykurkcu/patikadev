package week3;

import java.util.Scanner;

public class w3h7 {
    public static void main(String[] args) {
        System.out.println("Desene göre method oluşturma");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Output: ");
        nRecursive(nRecursive(number), number);
        //overloaded functions with different outcomes as expected.-
    }

    static int nRecursive(int n){
        if (n <= 0){
            return n;
        }
        System.out.print(n + " ");
        return nRecursive(n-5);
    }
    static int nRecursive(int n, int i){
        if (n > i){
            return n;
        }
        System.out.print(n + " ");
        return nRecursive(n+5, i);
    }
}
