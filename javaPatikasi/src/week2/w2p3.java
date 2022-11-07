package week2;

import java.util.Arrays;
import java.util.Scanner;

public class w2p3 {
    public static void main(String[] args) {
        System.out.println("Geçti kaldı ortalama");
        int[] grades = new int[5];
        int newLength = 5;
        double average = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        grades[0] = scan.nextInt();
        System.out.println("Fizik notunuz:");
        grades[1] = scan.nextInt();
        System.out.println("Türkçe notunuz:");
        grades[2] = scan.nextInt();
        System.out.println("Kimya notunuz:");
        grades[3] = scan.nextInt();
        System.out.println("Müzik notunuz:");
        grades[4] = scan.nextInt();

        for(int i = 0; i < 5 ; i++){
            if(grades[i] >= 0 && grades[i] <= 100){
                average = grades[i] + average;
            }else {
                System.out.println("Entered an invalid grade!");
                newLength--;
                System.out.println("New length:" + newLength);
            }
        }
        System.out.println("Grades:" + Arrays.toString(grades));
        System.out.println("Average is: " + (average / newLength));
    }
}
