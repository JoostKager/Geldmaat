package Automaat;

public class Controle extends Uitgifte {


    @Override
    public void geefGeld(Opname opnamebedrag) {
        if (opnamebedrag.getBedrag() % 5 == 0) {
            super.geefGeld(opnamebedrag);
        } else {
            System.out.println("voer aub een bedrag in wat een veelvoud is van 5");
        }
    }
}
