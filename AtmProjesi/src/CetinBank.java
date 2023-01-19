import java.sql.SQLOutput;
import java.util.Scanner;
public class CetinBank {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int kalanHak = 3;
        long bakiye = 100000000;
        int secenek = 0;
        while (kalanHak > 0) {
            System.out.print("Kullanıcı Adı veya Hesap Numaranız: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifreniz: ");
            sifre = input.nextLine();
            if (kullaniciAdi.equals("DenemeHesabı") && sifre.equals("123asd123"))
            {
                System.out.println("Merhaba Çetin Bank'a Hoşgeldiniz.");
                while(secenek!=4)
                {
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz...");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    secenek = input.nextInt();
                    switch (secenek)
                    {
                        case 1:
                            System.out.println("Para Miktarı: ");
                            int miktar = input.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            miktar = input.nextInt();
                            if (miktar > bakiye)
                            {
                                System.out.println("Bakiye Yetersiz!!!");
                            }
                            else
                            {
                                bakiye -= miktar;
                            }
                            break;
                        case 3:
                            System.out.println("Güncel Bakiye: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere...");
                            kalanHak = 0;
                            break;
                        default:
                            System.out.println("Geçersiz işlem seçimi.");
                    }
                }
            }
            else
            {
                kalanHak--;
                if (kalanHak == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur!!!");
                    break;
                }
                else{
                    System.out.println("Hatalı Kullanıcı Adı veya Şifre!!!");
                    System.out.println("Kalan Hakkınız: " + kalanHak);
                }
            }

        }
    }
}
