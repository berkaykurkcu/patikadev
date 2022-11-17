package week3;

public class w3p11 {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers");
        System.out.println(isPalindrome(242));

    }
    static boolean isPalindrome(int num){
        int temp = num, reverseNumber=0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10; //first value of lastNumber is the remaining of temp mod 10
            reverseNumber = (reverseNumber * 10 ) + lastNumber; //multiply reverseNumber by 10 to increment step value
            temp /= 10;
        }
        if(reverseNumber == num) return true;
        else return false;

    }
}
