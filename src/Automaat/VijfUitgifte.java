package Automaat;

public class VijfUitgifte extends Uitgifte {

    @Override
    public void geefGeld(Opname opnamebedrag) {
        int aantal = opnamebedrag.getBedrag() / 5;
        if (aantal != 0) {
            System.out.println("U ontvangt " + aantal + "x een briefje van €5,-");
            super.geefGeld(opnamebedrag);
        } else {
            super.geefGeld(opnamebedrag);
        }
    }
}

