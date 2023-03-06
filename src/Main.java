import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord;
        int right = 3;
        int select;
        int balance = 1500;
        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz :");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz :");
            passWord = input.nextLine();


            if (userName.equals("patika") && passWord.equals("dev123")) {
                System.out.println("Merhaba Patika Bankasına Hoş Geldiniz !");
                do {
                    System.out.println("İşlemler :");
                    System.out.println("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.println("Yapmak İstediğiniz İşlemi Giriniz :");
                    select = input.nextInt();
                    int price;


                    if (select == 1) {

                        System.out.print("Çekmek İstediğiniz Tutar :");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Yetersiz Bakiye!");
                        } else {
                            balance-=price;
                        }
                    } else if (select == 2) {
                        System.out.print("Yatırmak İstediğiniz Tutar :");
                        price = input.nextInt();
                        balance+=price;


                    } else if (select == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    }


                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere...");
                break;


            } else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Yanlış. Tekrar Deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur !");
                } else {
                    System.out.println("Kalan Hakkınız :" + right);
                }
            }

        }
    }
}