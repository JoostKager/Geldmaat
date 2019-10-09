package Automaat;

public class TwintigUitgifte extends Uitgifte {

    @Override
    public void geefGeld(Opname opnamebedrag) {
        int aantal = opnamebedrag.getBedrag() / 20;
        if (aantal != 0) {
            System.out.println("U ontvangt " + aantal + "x een briefje van €20,-");
            opnamebedrag.verlaagBedrag(aantal*20);
            super.geefGeld(opnamebedrag);
        } else {
            super.geefGeld(opnamebedrag);
        }
    }
}

