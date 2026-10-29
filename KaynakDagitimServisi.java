package afet;

import java.util.ArrayList;
import java.util.Comparator;

public class KaynakDagitimServisi {

    public void dagit(AfetBolgesi bolge){

        ArrayList<Talep> liste =
                bolge.getTalepler();

        liste.sort(
                Comparator.comparingInt(
                        Talep::getOncelik
                )
        );

        System.out.println(
                "\nKaynak Dağıtımı"
        );

        for(Talep t : liste){

            System.out.println(
                    t.getTur()
                            + " ihtiyacı karşılandı."
                            + " Öncelik: "
                            + t.getOncelik()
            );

        }
    }
}