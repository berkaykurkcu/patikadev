import java.util.Arrays;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        String[] items = {"Armut","Elma","Domates","Muz","Patlıcan"};
        double[] itemPrices = {2.14, 3.67, 1.11, 0.95, 5.00};
        int kilo;
        double total,cartTotal = 0;
        double[] cart = new double[items.length];
        System.out.println("Manav");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < items.length;i++){
            System.out.println(items[i] + " kaç kilo?");
            kilo = scan.nextInt();
            total = itemPrices[i] * kilo;
            cart[i] = total;
            System.out.println(total);
            System.out.println("Cart:" + Arrays.toString(cart));
        }
        for(int i = 0;i < cart.length;i++){
            cartTotal += cart[i];
        }
        System.out.println("Cart total:" +cartTotal);

    }
}
