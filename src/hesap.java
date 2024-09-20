
public class hesap {
    private String parola, isim;
    private int bakiye;
    
    public hesap(String isim,String parola,int bakiye){
        this.parola = parola;
        this.isim = isim;
        this. bakiye = bakiye;
    }
    public void setisim(String isim){
        this.isim = isim;
    }
    public String getisim(){
        return isim;
    }
    public void setparola(String parola){
        this.parola = parola;
    }
    public String getparola(){
        return parola;
    }
    public void setbakiye(int bakiye){
        this.bakiye = bakiye;
    }
    public int getbakiye(){
        return bakiye;
    }
    public void parayatir(int tutar){
        bakiye += tutar;
        System.out.println("islem tamamlandi, yeni bakiyeniz : " + bakiye);
    }
    public void paracek(int tutar){
        if(tutar > bakiye)
            System.out.println("bakiye yetersiz");
        else if(tutar > 2000)
            System.out.println("bir günde en fazla 2000tl cekebilirsiniz");
        else{ 
            bakiye -= tutar;
            System.out.println("islem tamamlandi, yeni bakiyeniz : " + bakiye);
        }
    }    
}
