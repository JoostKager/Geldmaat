package Automaat;

public class VijftigUitgifte extends Uitgifte {

    @Override
    public void geefGeld(Opname opnamebedrag) {
        int aantal = opnamebedrag.getBedrag() / 50;
        if (aantal != 0) {
            System.out.println("U ontvangt " + aantal + "x een briefje van €50,-");
            opnamebedrag.verlaagBedrag(aantal*50);
            super.geefGeld(opnamebedrag);
        } else {
            super.geefGeld(opnamebedrag);
        }
    }
}

