package week2;

import java.util.Scanner;

public class w2p5 {
    public static void main(String[] args) {
        System.out.println("3 sayıyı büyükten küçüğe sırala");
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayı");
        a = scan.nextInt();
        System.out.println("2. sayı");
        b = scan.nextInt();
        System.out.println("3. sayı");
        c = scan.nextInt();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("A<B<C");
            }else if(c<b){
                System.out.println("A<C<B");
            }
        } else if ((b<a) && (b<c)) {
            if(a<c){
                System.out.println("B<A<C");
            }else if(c<a){
                System.out.println("B<C<A");
            }
        }else if((c<a) && (c<b)){
            if(a<b){
                System.out.println("C<A<B");
            }else if(b<a){
                System.out.println("C<B<A");
            }
        }
    }
}
