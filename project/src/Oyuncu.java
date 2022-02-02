//************************************************************************************************************************************
//**********************************************************OYUNCU CLASSI*************************************************************
//************************************************************************************************************************************
import java.util.ArrayList;




public class Oyuncu {

    private String oyuncu_id;
    private String oyuncu_adi;
    private int skor;
    private ArrayList<Futbolcu> futbolcu_kart_listesi=new ArrayList<>();
    private ArrayList<Basketbolcu> basketbolcu_kart_listesi=new ArrayList<>();
    
    public Oyuncu() {
    }

    public Oyuncu(String oyuncu_id, String oyuncu_adi, int skor) {
        this.oyuncu_id = oyuncu_id;
        this.oyuncu_adi = oyuncu_adi;
        this.skor = skor;
    }

    public void skor_goster() {
        System.out.println("Skor : "+skor);
    }

    public Futbolcu kart_sec_futbolcu(){
        return null;
    }
    public Basketbolcu kart_sec_basketbolcu(){
        return null;
    }
    
    //GETTER AND SETTER
    public String getOyuncu_id() {
        return oyuncu_id;
    }

    public void setOyuncu_id(String oyuncu_id) {
        this.oyuncu_id = oyuncu_id;
    }

    public String getOyuncu_adi() {
        return oyuncu_adi;
    }

    public void setOyuncu_adi(String oyuncu_adi) {
        this.oyuncu_adi = oyuncu_adi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public ArrayList<Futbolcu> getFutbolcu_kart_listesi() {
        return futbolcu_kart_listesi;
    }
    
    public void setFutbolcu_kart_listesi(ArrayList<Futbolcu> futbolcu_kart_listesi) {
        this.futbolcu_kart_listesi = futbolcu_kart_listesi;
    }

    public ArrayList<Basketbolcu> getBasketbolcu_kart_listesi() {
        return basketbolcu_kart_listesi;
    }
    //LISTELERE ATAMA YAPAR
    public void setBasketbolcu_kart_listesi(ArrayList<Basketbolcu> basketbolcu_kart_listesi) {
        this.basketbolcu_kart_listesi = basketbolcu_kart_listesi;
    }
    public void futbolcuya_ekle(ArrayList<Futbolcu> yollanan){
        futbolcu_kart_listesi.add(yollanan.get(0));
    }
    public void basketbolcuya_ekle(ArrayList<Basketbolcu> yollanan){
        basketbolcu_kart_listesi.add(yollanan.get(0));
    }
    
}
