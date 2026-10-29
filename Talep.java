package afet;

public class Talep {

    private String tur;
    private int miktar;
    private int oncelik;

    public Talep(String tur,int miktar,int oncelik) {

        this.tur=tur;
        this.miktar=miktar;
        this.oncelik=oncelik;
    }

    public String getTur() {
        return tur;
    }

    public int getMiktar() {
        return miktar;
    }

    public int getOncelik() {
        return oncelik;
    }
}