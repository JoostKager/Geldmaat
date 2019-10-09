package Automaat;

public interface GeldUitgifte {
    public abstract void setNext(GeldUitgifte nextInChain);
    public abstract void geefGeld(Opname opnamebedrag);
}
