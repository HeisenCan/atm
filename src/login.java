import java.util.Scanner;
public class login {
    public boolean giris(hesap hsp){
        Scanner input = new Scanner(System.in);
        String isim,parola;
        
        System.out.println("Kullanici adi : ");
        isim = input.nextLine();
        System.out.println("Parola : ");
        parola = input.nextLine();
        
        if (hsp.getisim().equals(isim) && hsp.getparola().equals(parola))
            return true;
        else
            return false;
    }
}
