package Automaat;

public class HonderdUitgifte extends Uitgifte {

    @Override
    public void geefGeld(Opname opnamebedrag) {
        int aantal = opnamebedrag.getBedrag() / 100;
        if (aantal != 0) {
            System.out.println("U ontvangt " + aantal + "x een briefje van €100,-");
            opnamebedrag.verlaagBedrag(aantal * 100);
            super.geefGeld(opnamebedrag);
        } else {
            super.geefGeld(opnamebedrag);
        }
    }
}
