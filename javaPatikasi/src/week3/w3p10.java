package week3;

public class w3p10 {
    public static void main(String[] args) {
        System.out.println("W3P10");
        int sayi1 = 18, sayi2=24;
        int ebob=1,ekok;
        int j = 1;
        while(j<=sayi1 && j<=sayi2){
            if(sayi1 % j == 0 && sayi2  % j == 0){
                System.out.println("While ile bulduk!" + j);
                ebob = j;
            }j++;
        }
        ekok = (sayi1*sayi2)/ebob;
        System.out.println("Ebob: " + ebob + " Ekok: " + ekok);
    }
}
