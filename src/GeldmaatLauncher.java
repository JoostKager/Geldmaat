import Automaat.*;

public class GeldmaatLauncher {

    public static void main(String[] args) {
        GeldmaatLauncher geldmaat = new GeldmaatLauncher();
        geldmaat.run();
    }
    private void run(){
        GeldUitgifte start = stelautomaatin();

        Opname b1 = new Opname(475);
        Opname b2 = new Opname(260);
        Opname b3 = new Opname(95);
        Opname b4 = new Opname(35);
        Opname b5 = new Opname(123);

        System.out.println("uitgifte voor: "+b1.getBedrag());
        start.geefGeld(b1);
        System.out.println();
        System.out.println("uitgifte voor: "+b2.getBedrag());
        start.geefGeld(b2);
        System.out.println();
        System.out.println("uitgifte voor: "+b3.getBedrag());
        start.geefGeld(b3);
        System.out.println();
        System.out.println("uitgifte voor: "+b4.getBedrag());
        start.geefGeld(b4);
        System.out.println();
        System.out.println("uitgifte voor: "+b5.getBedrag());
        start.geefGeld(b5);
     }

    private GeldUitgifte stelautomaatin(){
        GeldUitgifte check = new Controle();
        GeldUitgifte honderd = new HonderdUitgifte();
        GeldUitgifte vijftig = new VijftigUitgifte();
        GeldUitgifte twintig = new TwintigUitgifte();
        GeldUitgifte tien = new TienUitgifte();
        GeldUitgifte vijf = new VijfUitgifte();
        check.setNext(honderd);
        honderd.setNext(vijftig);
        vijftig.setNext(twintig);
        twintig.setNext(tien);
        tien.setNext(vijf);
        return check;
    }
}
