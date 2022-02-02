//************************************************************************************************************************************
//**********************************************************SPORCU CLASSI*************************************************************
//************************************************************************************************************************************

import javax.swing.ImageIcon;



public class Sporcu {
    
    private String spocu_isim;
    private String sporcu_takim;
    private String dosya_yolu;
    private ImageIcon icon;
    public Sporcu() {
    }
    
    public Sporcu(String spocu_isim, String sporcu_takim, String dosya_yolu) {
        this.spocu_isim = spocu_isim;
        this.sporcu_takim = sporcu_takim;
        this.dosya_yolu = dosya_yolu;
        this.icon=new ImageIcon(dosya_yolu);
    }

    
    public void sporcu_puani_goster(){
        
    }
    
    //GETTER AND SETTER
    public String getSpocu_isim() {
        return spocu_isim;
    }

    public void setSpocu_isim(String spocu_isim) {
        this.spocu_isim = spocu_isim;
    }

    public String getSporcu_takim() {
        return sporcu_takim;
    }

    public void setSporcu_takim(String sporcu_takim) {
        this.sporcu_takim = sporcu_takim;
    }    

    public String getDosya_yolu() {
        return dosya_yolu;
    }

    public void setDosya_yolu(String dosya_yolu) {
        this.dosya_yolu = dosya_yolu;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
}
