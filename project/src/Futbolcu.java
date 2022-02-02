//************************************************************************************************************************************
//*********************************************************FUTBOLCU CLASSI************************************************************
//************************************************************************************************************************************
public class Futbolcu extends Sporcu {

    private int penalti;
    private int kaleciyle_karsi_karsiya;
    private int serbest_atis;
    private boolean kart_kullanildimi=false;
    public Futbolcu() {
    } 

    public Futbolcu(int penalti, int kaleciyle_karsi_karsiya, int serbest_atis, String spocu_isim, String sporcu_takim, String dosya_yolu) {
        super(spocu_isim, sporcu_takim, dosya_yolu);
        this.penalti = penalti;
        this.kaleciyle_karsi_karsiya = kaleciyle_karsi_karsiya;
        this.serbest_atis = serbest_atis;
    }

    //GETTER AND SETTER
    public boolean isKart_kullanildimi() {
        return kart_kullanildimi;
    }

    public void setKart_kullanildimi(boolean kart_kullanildimi) {
        this.kart_kullanildimi = kart_kullanildimi;
    }

    
    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getKaleciyle_karsi_karsiya() {
        return kaleciyle_karsi_karsiya;
    }

    public void setKaleciyle_karsi_karsiya(int kaleciyle_karsi_karsiya) {
        this.kaleciyle_karsi_karsiya = kaleciyle_karsi_karsiya;
    }

    public int getSerbest_atis() {
        return serbest_atis;
    }

    public void setSerbest_atis(int serbest_atis) {
        this.serbest_atis = serbest_atis;
    }
     @Override
    public void sporcu_puani_goster(){
        System.out.println("Penaltı : "+penalti);
        System.out.println("Serbest Atış : "+serbest_atis);
        System.out.println("Kaleciyle Karşı Karşıya : "+kaleciyle_karsi_karsiya);
    }
}
