package week3;

public class w3p12 {

    static int fibonacci(int number){
        if(number==1 || number==2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2);
    }
    public static void main(String[] args) {
        System.out.println("Recursive Fibonacci");
        System.out.println(fibonacci(6));
    }
}
