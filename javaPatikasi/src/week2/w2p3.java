package week2;

import java.util.Arrays;
import java.util.Scanner;

public class w2p3 {
    public static void main(String[] args) {
        //geçti kaldı ortalama
        int[] grades = new int[5];
        String[] classes = {"Matematik","Fizik","Türkçe","Kimya","Müzik"};
        int newLength = 5;
        double average = 0;

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < grades.length; i++){
            System.out.println(classes[i] + " notunuz:");
            grades[i] = scan.nextInt();
            if(grades[i] < 0 || grades[i] >100){
                System.out.println("Entered an invalid grade!");
                newLength--;
                System.out.println("New length:" + newLength);
            }else{
                average = grades[i] + average;
            }
        }
        System.out.println("Grades:" + Arrays.toString(grades));
        System.out.println("Average is: " + (average / newLength));
    }
}
