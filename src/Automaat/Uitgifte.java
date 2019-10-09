package Automaat;

public abstract class Uitgifte implements GeldUitgifte{

    private GeldUitgifte uitgifte;

    public void setNext(GeldUitgifte volgende) {
        uitgifte = volgende;
    }

    public void geefGeld(Opname opnamebedrag) {
        if (uitgifte != null) {
            uitgifte.geefGeld(opnamebedrag);
        }
    }
}
