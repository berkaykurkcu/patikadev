package week2;

import java.util.Scanner;

public class w2p2 {
    public static void main(String[] args) {
        String username,password,isPasswordReset,newPassword;
        System.out.println("Log-In");
        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz:");
        username = scan.nextLine();
        System.out.println("Şifre giriniz:");
        password = scan.nextLine();
        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Başarıyla giriş yaptınız!");
        }else{
            System.out.println("Şifreniz yanlış! Şifrenizi sıfırlamak için 'yes' yazınız.");
            isPasswordReset = scan.nextLine();
            if(isPasswordReset.equals("yes")){
                System.out.println("Yeni şifrenizi giriniz:");
                newPassword = scan.nextLine();
                password = newPassword;
                System.out.println("Yeni şifreniz: " + password);
            }else{
                System.out.println("Çıkış yapılıyor!");
            }
        }
    }
}
