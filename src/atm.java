import java.util.Scanner;
public class atm {
    public void calis(hesap hsp){
        login lgn = new login();
        Scanner input = new Scanner(System.in);
        int hak = 3;
        
        System.out.println("bankamiza hosgeldiniz");
        System.out.println("kullanici girisi");
        
        while(true){
            if(lgn.giris(hsp)){
                System.out.println("giris basarili");
                break;
            }
            else{
                System.out.println("giris basarisiz");
                hak -= 1;
                System.out.println("kalan giris hakki " + hak);
            }
            if(hak == 0){
                System.out.println("giris hakkiniz bitti");
                return;
            }
                
        }
        String islemler = "1.bakiye goruntule\n" + "2.para yatirma\n" + "3.para cekme\n" + "cikis icin q ya basin";
        System.out.println(islemler);
        
        while(true){
            System.out.println("islemi secin : ");
            String islem = input.nextLine();
            
            if(islem.equals("q"))
                break;
            else if(islem.equals("1"))
                System.out.println("bakiyeniz : " + hsp.getbakiye());
            else if(islem.equals("2")){
                System.out.println("yatirmak istediginiz tutar : ");
                int tutar = input.nextInt();
                input.nextLine();
                hsp.parayatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("cekmek istediginiz tutar : ");
                int tutar = input.nextInt();
                input.nextLine();
                hsp.paracek(tutar);               
            }
            else
                System.out.println("geçersiz islem");
        }
    }    
}
