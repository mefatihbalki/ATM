import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int kalan = 3;
        int select;
        int balance = 1500;
        System.out.print("Kullanıcı Adı: ");
        username = input.nextLine();
        System.out.print("Parolanız: ");
        password = input.nextLine();
        while (true) {
            System.out.print("Kullanıcı Adı: ");
            username = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme Giriş Yaptınız!");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {

                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Güncel Tutar: " + balance);
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            int price1 = input.nextInt();
                            balance -= price1;
                            if (price1 > balance)
                                System.out.println("Bakiye yetersiz.");
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");

                            break;
                        default:
                            System.out.println("Hatalı Giriş!");
                    }

                if (select == 4) {
                    break;
                }
            } else {
                kalan--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (kalan == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    break;
                } else {
                    System.out.println("Kalan Hakkınız : " + kalan);
                }
            }
        }
    }
}