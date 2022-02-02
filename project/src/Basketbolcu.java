//************************************************************************************************************************************
//*******************************************************BASKETBOLCU CLASSI***********************************************************
//************************************************************************************************************************************
public class Basketbolcu extends Sporcu{
    private int ikilik;
    private int ucluk;
    private int serbest_atis;
    private boolean kart_kullanildimi=false;
    public Basketbolcu() {
    }

    public Basketbolcu(int ikilik, int ucluk, int serbest_atis, String spocu_isim, String sporcu_takim, String dosya_yolu) {
        super(spocu_isim, sporcu_takim, dosya_yolu);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbest_atis = serbest_atis;
    }

    public boolean isKart_kullanildimi() {
        return kart_kullanildimi;
    }

    public void setKart_kullanildimi(boolean kart_kullanildimi) {
        this.kart_kullanildimi = kart_kullanildimi;
    }

    
    
    
    @Override
    public void sporcu_puani_goster(){
        System.out.println("İkilik : "+ikilik);
        System.out.println("Üçlük : "+ucluk);
        System.out.println("Serbest Atış : "+serbest_atis);
    }
    
    
    
    //GETTER AND SETTER
    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbest_atis() {
        return serbest_atis;
    }

    public void setSerbest_atis(int serbest_atis) {
        this.serbest_atis = serbest_atis;
    }
    
}
