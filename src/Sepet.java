import java.util.HashMap;
import java.util.Map;

public class Sepet {

    private Map<Urun,Double> urunKiloMap = new HashMap<Urun,Double>();
    private double toplamFiyat;


    public Map<Urun, Double> getUrunKiloMap() {
        return urunKiloMap;
    }

    public void setUrunKiloMap() {
       // musteri.getSecilenUrunlerMap().keySet().stream();
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }

    @Override
    public String toString() {
        return  urunKiloMap+"" ;
    }

}
