package week3;

import java.util.Scanner;

public class w3p1 {
    public static void main(String[] args) {
        System.out.println("Find even numbers up until the input number");
	int k;
	Scanner inp = new Scanner(System.in);

	System.out.println("Sayı giriniz: ");
	k = inp.nextInt();

  for(int i = 0; i <= k; i++ ){
      if(i % 3==0 && i % 4 == 0){
        System.out.println("K: " + i );
      }
    }
  }
}
