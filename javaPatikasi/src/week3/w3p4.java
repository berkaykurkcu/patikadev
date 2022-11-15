package week3;
import java.util.Scanner;

public class w3p4 {
    public static void main(String[] args) {
        System.out.println("Kombinasyon hesaplayan program? C(n,r) = n! / (r! * (n-r)!)\n");
        Scanner scan = new Scanner(System.in);
        int k=5,dupeK;
        int total = 1;
        dupeK = k;
        System.out.println("with recursive: "+factorial(k));
        for(int i=1;i<=k;i++){
            total = total * dupeK;
            dupeK--;
        }
        System.out.println("with iterative: "+total);
    int n,r,comb;
    System.out.println("-----------------");
    System.out.println("Enter n");
    n = scan.nextInt();
    System.out.println("Enter r");
    r = scan.nextInt();

    comb = factorial(n) / (factorial(r) * factorial(n-r));
    System.out.println("Combination is: " + comb);

  }

    public static int factorial(int num){
        if(num>=1){
            return num * factorial(num -1);
        }
        else
            return 1;
    }
}

