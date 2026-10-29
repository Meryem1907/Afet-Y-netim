package afet;

import java.util.ArrayList;

public class AfetYonetimSistemi {

    private ArrayList<Personel> personeller =
            new ArrayList<>();

    private ArrayList<Kaynak> kaynaklar =
            new ArrayList<>();

    public void personelEkle(
            Personel p){

        personeller.add(p);
    }

    public void kaynakEkle(
            Kaynak k){

        kaynaklar.add(k);
    }

    public void raporGoster(){

        System.out.println(
                "\nKaynaklar"
        );

        for(Kaynak k : kaynaklar){

            System.out.println(
                    k.getAd()
                            +" : "
                            +k.getMiktar()
            );
        }
    }
}