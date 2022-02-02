//************************************************************************************************************************************
//********************************************************KULLANICI CLASSI************************************************************
//************************************************************************************************************************************

public class Kullanici extends Oyuncu {

    public Kullanici() {

    }

    public Kullanici(String oyuncu_id, String oyuncu_adi, int skor) {
        super(oyuncu_id, oyuncu_adi, skor);
    }

    @Override
    public Basketbolcu kart_sec_basketbolcu() {
        
        return null;
    }

    @Override
    public Futbolcu kart_sec_futbolcu() {
        return null;
    }

}
