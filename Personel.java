package afet;

public class Personel extends Kisi{

    private String gorev;

    public Personel(int id,String ad,String gorev) {
        super(id,ad);
        this.gorev=gorev;
    }

    @Override
    public void bilgiGoster() {

        System.out.println(
                "Personel: "
                        + getAd()
                        + " Görev: "
                        + gorev
        );
    }
}