package week2;

import java.util.Scanner;

public class w2h1 {
    public static void main(String[] args) {
        System.out.println("Week 2 Homework 1");
        int km,yolculukTipi,yas;
        double calcPrice;
        double newPrice;
        double latestPrice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Yolculuk tipini giriniz 1-2");
        yolculukTipi = scan.nextInt();
        System.out.println("Yaş giriniz");
        yas = scan.nextInt();
        System.out.println("KM giriniz");
        km = scan.nextInt();
        newPrice = km * 0.10;
        if(yolculukTipi == 1 || yolculukTipi ==2){
            if(yas>0){
                if(km>0){
                    System.out.println("Bilgiler doğru!");
                    if(yas<12){
                        System.out.println("Yaşınız 12'den küçük! %50 indirim uygulandı.");
                        if(yolculukTipi == 1){
                            calcPrice = (km * 0.10) * 0.5;
                            newPrice -= calcPrice;
                            System.out.println("Tek yön Ücret: " +newPrice);
                        }else{
                            calcPrice = (km * 0.10) * 0.5;
                            newPrice = (calcPrice - calcPrice * 0.2)*2;
                            System.out.println("Gidiş-dönüş indirimi %20 ! Fiyat: " + newPrice);
                        }
                    }else if(yas >= 12 && yas <=24){
                        System.out.println("Yaşınız 12-24 arasında! %10 indirim uygulandı.");
                        if(yolculukTipi == 1){
                            calcPrice = (km * 0.10) * 0.1;
                            newPrice -= calcPrice;
                            System.out.println("Tek yön Ücret: " +newPrice);
                        }else{
                            calcPrice = ((km * 0.10) * 2);
                            newPrice = calcPrice - (calcPrice * 0.2);
                            latestPrice = newPrice - newPrice * 0.1;
                            System.out.println("Gidiş-dönüş indirimi %20 ! Fiyat: " + latestPrice);
                        }
                    }else if(yas>=65){
                        System.out.println("Yaşınız 65 veya üstü! %30 indirim uygulandı.");
                        if(yolculukTipi == 1){
                            calcPrice = (km * 0.10) * 0.3;
                            System.out.println("Gidiş dönüş ekstra %20 indirim!Fiyat: " +calcPrice);
                        }else{
                            calcPrice = (km * 0.10) * 0.3;
                            newPrice = (calcPrice - calcPrice * 0.3) * 2;
                            latestPrice = newPrice - newPrice * 0.1;
                            System.out.println("Price: " +latestPrice);
                        }
                    }else{
                        System.out.println("İndirim yok");
                        calcPrice = km * 0.10;
                        System.out.println("İndirimsiz fiyat: " +calcPrice);
                    }
                }
                else{
                    System.out.println("KM yanlış");
                }
            }else{
                System.out.println("Yaş yanlış");
            }
        }else {
            System.out.println("Yolculuk tipi yanlış!");
        }
    }
}
