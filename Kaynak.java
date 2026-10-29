package afet;

public class Kaynak {

    private String ad;
    private int miktar;

    public Kaynak(String ad,int miktar) {
        this.ad=ad;
        this.miktar=miktar;
    }

    public String getAd() {
        return ad;
    }

    public int getMiktar() {
        return miktar;
    }
}