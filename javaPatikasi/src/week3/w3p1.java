package week3;

import java.util.Scanner;

public class w3p1 {
    public static void main(String[] args) {
        System.out.println("Find even numbers up until the input number");
	int k;
	Scanner inp = new Scanner(System.in);

	System.out.println("Sayı giriniz: ");
	k = inp.nextInt();

	if(k % 2 == 0){
		System.out.println("K is even");
	}else{
		System.out.println("K is odd");
    }
}
}

