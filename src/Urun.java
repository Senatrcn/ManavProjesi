
public class Urun {


    public static int urunIdCount;
    private int id;
    private String urunIsmi;
    private double birimFiyat;

    public Urun(int id,String urunIsmi, double birimFiyat) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.birimFiyat = birimFiyat;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    @Override
    public String toString() {
        return "Urun Id : " + id +
                " Urun : " + urunIsmi +
                " Birim Fiyat : " + birimFiyat;
    }
}
