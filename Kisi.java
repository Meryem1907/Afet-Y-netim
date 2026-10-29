package afet;

public abstract class Kisi {

    private int id;
    private String ad;

    public Kisi(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public abstract void bilgiGoster();
}