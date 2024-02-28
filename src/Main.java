import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scanner sınıfı projeye dahil edildi
public class Main {
    public static void main(String[] args) {

        //parola ve şifre için String veri türüne userName ve Password değikenleri atadık
        String userName, password;

        int     //Right yani Giriş hakı sayısı
                right = 3,
                //balance yani bakiye
                balance = 1500,
                //select yapılacak seçimin atanacağı değişken seçim
                select,
                //price yani alınacak veriyi tutacak değişken
                price;

        Scanner userInput = new Scanner(System.in);

        while (right > 0) {

            System.out.print("Kullanıcı Adınız ?: ");

            userName = userInput.nextLine();

            System.out.print("Parolanız ?: ");

            password = userInput.nextLine();



            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz bankasına Hoş geldiniz");
                do {
                    System.out.println("1-Para Yatırma\n"
                            + "2-Para Çekme\n"
                            + "3-Bakiye Sorgula\n"
                            + "4-Çıkış");
                    System.out.print("Yapmak istediginiz işlem ?: ");
                    select = userInput.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Tutar Giriniz: ");
                            price = userInput.nextInt();
                            balance += price;
                            System.out.println("İşlem Başaralı");
                        case 2:
                            System.out.print("Tutar Giriniz: ");
                            price = userInput.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price;
                                System.out.print("İşlem Başaralı");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Bekleriz");
                break;
            } else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı Tekrar Deneyiniz !");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Oldu");
                } else {
                    System.out.println("Kalan hakkınız !: " + right);
                }
            }
        }
    }
}