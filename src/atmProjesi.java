import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullan�c� Ad�n� Giriniz:");
            userName = input.nextLine();
            System.out.print("�ifrenizi Giriniz:");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
                do {
                    System.out.println("1-Para Yat�rma\n" +
                            "2-Para �ekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-��k��");
                    System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Yat�r�lacak Para Miktar�:");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("�ekilecek Para Miktar�:");
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
                System.out.print("Tekrar G�r��mek �zere!");
            } else {
                right--;
                System.out.println("Hatal� Kullan�c� Ad� veya �ifre!");
                if (right == 0) {
                    System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz!");
                } else {
                    System.out.println("Kalan Hakk�n�z:" + right);
                }
            }
        }
    }
}
