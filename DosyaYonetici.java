package afet;

import java.io.FileWriter;
import java.io.IOException;

public class DosyaYonetici implements IKayit {

    @Override
    public void kaydet(String veri) {

        try {
            FileWriter fw =
                    new FileWriter("veriler.txt", true);

            fw.write(veri);
            fw.write("\n");

            fw.close();

        } catch (IOException e) {

            System.out.println("Dosya hatası oluştu!");
        }
    }
}