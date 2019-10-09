package Automaat;

public class TienUitgifte extends Uitgifte {

    @Override
    public void geefGeld(Opname opnamebedrag) {
        int aantal = opnamebedrag.getBedrag() / 10;
        if (aantal != 0) {
            System.out.println("U ontvangt " + aantal + "x een briefje van €10,-");
            opnamebedrag.verlaagBedrag(aantal*10);
            super.geefGeld(opnamebedrag);
        } else {
            super.geefGeld(opnamebedrag);
        }
    }
}
