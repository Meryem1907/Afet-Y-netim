package afet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        AfetYonetimSistemi sistem =
                new AfetYonetimSistemi();

        DosyaYonetici dosya =
                new DosyaYonetici();

        AfetBolgesi bolge =
                new AfetBolgesi("Hatay");

        while(true){

            System.out.println(
                    "\n=== AFET YÖNETİM SİSTEMİ ==="
            );

            System.out.println(
                    "1-Personel Ekle"
            );

            System.out.println(
                    "2-Kaynak Ekle"
            );

            System.out.println(
                    "3-Talep Ekle"
            );

            System.out.println(
                    "4-Rapor Göster"
            );

            System.out.println(
                    "5-Kaynak Dağıt"
            );

            System.out.println(
                    "0-Çıkış"
            );

            int secim =
                    sc.nextInt();

            sc.nextLine();

            switch(secim){

                case 1:

                    System.out.print(
                            "Personel Ad:"
                    );

                    String ad =
                            sc.nextLine();

                    Personel p =
                            new Personel(
                                    1,
                                    ad,
                                    "Arama Kurtarma"
                            );

                    sistem.personelEkle(p);

                    dosya.kaydet(
                            "PERSONEL | Ad: " + ad
                    );

                    break;

                case 2:

                    System.out.print(
                            "Kaynak Ad:"
                    );

                    String kaynak =
                            sc.nextLine();

                    System.out.print(
                            "Miktar:"
                    );

                    int miktar =
                            sc.nextInt();

                    sistem.kaynakEkle(
                            new Kaynak(
                                    kaynak,
                                    miktar
                            )
                    );
                    dosya.kaydet(
                            "KAYNAK | Ad: "
                                    + kaynak
                                    + " | Miktar: "
                                    + miktar
                    );

                    break;

                case 3:

                    System.out.print(
                            "Talep Türü:"
                    );

                    String tur =
                            sc.nextLine();

                    System.out.print(
                            "Miktar:"
                    );

                    int m =
                            sc.nextInt();

                    System.out.print(
                            "Öncelik:"
                    );

                    int o =
                            sc.nextInt();

                    bolge.talepEkle(
                            new Talep(
                                    tur,
                                    m,
                                    o
                            )
                    );
                    dosya.kaydet(
                            "TALEP | Tür: "
                                    + tur
                                    + " | Miktar: "
                                    + m
                                    + " | Öncelik: "
                                    + o
                    );1

                    break;

                case 4:

                    sistem.raporGoster();

                    break;

                case 5:

                    new KaynakDagitimServisi()
                            .dagit(bolge);

                    break;

                case 0:

                    System.exit(0);

            }

        }

    }
}