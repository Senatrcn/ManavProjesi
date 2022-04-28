import java.util.HashMap;
import java.util.Map;

public class Musteri {

    public static int musteriIdCount;
    private int id;
    private String kullaniciAdi;
    private String parola;
    double bakiye;
    private Sepet sepet = new Sepet();

    public Musteri() {

    }
    public Musteri(int id,String kullaniciAdi, String parola){
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }


    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }

    @Override
    public String toString() {
        return "Kullanici Adi : " + kullaniciAdi +
                " Bakiye : "+ (float)bakiye;
    }
}
