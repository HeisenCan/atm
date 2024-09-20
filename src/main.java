
public class main {
    public static void main(String[] args) {
        atm Atm = new atm();
        hesap hsp = new hesap("can ersoz","1234",2000);
        Atm.calis(hsp);
        System.out.println("programdan cikiliyor");   
    }   
}
