//************************************************************************************************************************************
//********************************************************BILGISAYAR CLASSI***********************************************************
//************************************************************************************************************************************
public class Bilgisayar extends Oyuncu {

    private int kullanilan_futbolcu_sayisi = 0;
    private int kullanilan_basketbolcu_sayisi = 0;

    public Bilgisayar() {
    }

    public Bilgisayar(String oyuncu_id, String oyuncu_adi, int skor) {
        super(oyuncu_id, oyuncu_adi, skor);
    }

    @Override
    public Basketbolcu kart_sec_basketbolcu() {
        for (int i = 0; i < 4; i++) {
            if (getBasketbolcu_kart_listesi().get(i).isKart_kullanildimi() == true) {
                kullanilan_basketbolcu_sayisi++;

            } else {
                kullanilan_basketbolcu_sayisi = 0;
                break;
            }
        }
        if (kullanilan_basketbolcu_sayisi == 4) {
            return null;
        }
        while (true) {
            int secenek = (int) (Math.random() * 4);
            if (getBasketbolcu_kart_listesi().get(secenek).isKart_kullanildimi() == true) {
                continue;
            } else {

                return getBasketbolcu_kart_listesi().get(secenek);
            }

        }
    }

    @Override
    public Futbolcu kart_sec_futbolcu() {
        for (int i = 0; i < 4; i++) {
            if (getFutbolcu_kart_listesi().get(i).isKart_kullanildimi() == true) {
                kullanilan_futbolcu_sayisi++;
            }else{
                kullanilan_futbolcu_sayisi=0;
                break;
            }
        }
        if(kullanilan_futbolcu_sayisi==4){
            return null;
        }
        while (true) {
            int secenek = (int) (Math.random() * 4);
            if (getFutbolcu_kart_listesi().get(secenek).isKart_kullanildimi() == true) {
                continue;
            } else {

                return getFutbolcu_kart_listesi().get(secenek);
            }
        }
    }

}
