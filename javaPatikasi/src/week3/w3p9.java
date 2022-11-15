package week3;
import java.util.*;


public class w3p9 {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM machine.");
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int balance=1500,right=3,select;
    while(right>0){
      System.out.println("Kullanıcı adınız: ");
      userName = scan.nextLine();
      System.out.println("Parolanız: ");
      password = scan.nextLine();

      if(userName.equals("patika")&& password.equals("dev123")){
        System.out.println("Welcome to ATM!!");
        do{
          System.out.println("1-Para yatırma\n" +
          "2-Para çekme\n" + 
          "3-Bakiye sorgula\n" + 
          "4-Çıkış yap");
          System.out.println("Lütfen seçim yapınız: ");
          select = scan.nextInt();
          switch(select){
            case 1:
              System.out.println("Kaç para yatırmak istiyorsunuz? ");
              int miktar = scan.nextInt();
              balance += miktar;
              System.out.println("Başarılı! Yeni bakiyeniz: " +balance);
              break;
            case 2:
              System.out.println("Kaç para çekmek istiyorsunuz? ");
              int price = scan.nextInt();
              if(price>balance) System.out.println("Yeteri kadar paranız yok");
              else balance -= price;
              break;
            case 3:
              System.out.println("Bakiyeniz: " + balance);
              break;
          }
        }while(select != 4);
        System.out.println("Görüşmek üzere!");
        break;
      }else{
          right--;
          System.out.println("Hatalı kullanıcı adı/şifre");
      }
    }
    if(right == 0){
      System.out.println("Hakkınız kalmadı! ATM Kapanıyor.");
      return;
    }
    else{
      System.out.println("Kalan hakkınız: " +right);
    }

    }


}
