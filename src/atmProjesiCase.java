import java.util.Scanner;

public class atmProjesiCase {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz:");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Merhaba, xxxx Bankasına Hoşgeldiniz!");


                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");

                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                    select = input.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Yatırılacak Tutarı Giriniz:");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek Tutarı Giriniz:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                        case 4:
                            break;
                        default:
                            System.out.println("Hatalı seçim yapıldı tekrar deneyiniz!");
                            break;
                    }
                } while (select != 4);
                System.out.print("Tekrar Görüşmek Üzere!");
                break;
            } else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı Tekrar Deneyiniz!");
                System.out.println("Kalan Hakkınız:" + right);
                if (right == 0) {
                    System.out.print("Hesabınız bloke edilmiştir lütfen bankamız ile iletişime geçiniz! ");
                }
            }
        }
    }
}