import java.util.Map;

public class Utilities extends Statics {
    public static void urunListele(Urun u){
        System.out.printf(B+"%3d %13s %13.2f %1s", u.getId(),u.getUrunIsmi() , u.getBirimFiyat(), "\n");
    }
    public static double fiyatHesapla(Map.Entry<Urun,Double> each){
        double urunFiyat = 0;
        urunFiyat +=  each.getKey().getBirimFiyat()*each.getValue();
        return urunFiyat;
    }

    public static void sepetiYazdir(Map.Entry<Urun,Double> each){
        System.out.printf(B+"%-8s %12.1f %-2s", each.getKey().getUrunIsmi(),each.getValue()," kg\n");
    }
    public static void sepetiIdNoIleYazdir(Map.Entry<Urun,Double> each){
        System.out.printf(B+"%3d %10s %11.2f %-2s\n",each.getKey().getId(), each.getKey().getUrunIsmi(),each.getValue()," kg");
    }
    public static int musteriIdBul(String girilenIsim,String girilenParola) {
        int id=0;
        for (Map.Entry<Integer,Musteri> entry : tumMusteriler.entrySet()) {
            if (entry.getValue().getKullaniciAdi().equals(girilenIsim)&&entry.getValue().getParola().equals(girilenParola)) {
                id= entry.getKey();
            }
        }
        return id;
    }
}
