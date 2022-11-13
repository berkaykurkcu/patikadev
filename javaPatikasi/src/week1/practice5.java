import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        System.out.println("Dairenin alanını ve çevresini bulan program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Yarıçapı gir:");
        r = scan.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Alan:" + alan + " Çevre:" + cevre);
    }
}
