import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanýcý Adýný Giriniz:");
            userName = input.nextLine();
            System.out.print("Þifrenizi Giriniz:");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
                do {
                    System.out.println("1-Para Yatýrma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çýkýþ");
                    System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Yatýrýlacak Para Miktarý:");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Çekilecek Para Miktarý:");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.print("Yetersiz Bakiye!");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz:" + balance);
                    }
                } while (select != 4);
                System.out.print("Tekrar Görüþmek Üzere!");
            } else {
                right--;
                System.out.println("Hatalý Kullanýcý Adý veya Þifre!");
                if (right == 0) {
                    System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz!");
                } else {
                    System.out.println("Kalan Hakkýnýz:" + right);
                }
            }
        }
    }
}
