package afet;

public class Vatandas extends Kisi {

    private String ihtiyac;

    public Vatandas(int id,String ad,String ihtiyac) {
        super(id,ad);
        this.ihtiyac=ihtiyac;
    }

    @Override
    public void bilgiGoster() {
        System.out.println(
                "Vatandaş: "
                        + getAd()
                        + " İhtiyaç: "
                        + ihtiyac
        );
    }
}