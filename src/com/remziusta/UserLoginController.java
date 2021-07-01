package com.remziusta;

import java.util.Scanner;

public class UserLoginController {
    public static String username = "user";
    public static String password = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.print("Kullanıcı Adı : "); 
        String usernameInput = sc.nextLine();
        System.out.print("Şifre : ");
        String passwordInput = sc.nextLine();

        if(usernameInput.equals(username) && passwordInput.equals(password))
            System.out.println("Giriş Başarılı");
        else{
            System.out.println(username + " parolası yanlış değiştirmek ister misin ? " );
            System.out.println("1 - Evet");
            System.out.println("2 - Hayır");
            System.out.println("3 - Çıkış");
            short input = Short.parseShort(sc.next());

            switch (input) {
                case 1:
                    System.out.print("Yeni şifrenizi girin : ");
                    String passwordNew = sc.next();
                    if(!passwordNew.equals(password)){
                        password = passwordNew;
                        System.out.println("Şifre Değiştirme Başarılı...");
                    } 
                    else{
                        System.out.println("Şifreniz önceki şifre ile aynı olamaz.");
                    }
                    break;
                case 2:
                    System.out.println("Tekrar giriş yapmayı deneyin.");
                    break;
                case 3:
                    System.out.println("Giriş sayfası kapanıyor...");
                    System.exit(1);
                    break;
                default:
                    break;
            }

        }
        }
    }
}
