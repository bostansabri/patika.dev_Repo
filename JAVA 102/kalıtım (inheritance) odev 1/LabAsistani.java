public class LabAsistani extends Asistan{

    public LabAsistani(String adsoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati){
        super(adsoyad,telefon,eposta,bolum,unvan,ofisSaati);
    }

    public void labaGir(){
        System.out.println(this.getAdSoyad()+ " Labaratuvara Girdi");
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad()+ " Derse Girdi");
    }

}
