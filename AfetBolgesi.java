package afet;

import java.util.ArrayList;

public class AfetBolgesi {

    private String ad;

    private ArrayList<Talep> talepler =
            new ArrayList<>();

    public AfetBolgesi(String ad) {
        this.ad=ad;
    }

    public String getAd() {
        return ad;
    }

    public void talepEkle(Talep t) {
        talepler.add(t);
    }

    public ArrayList<Talep> getTalepler() {
        return talepler;
    }
}