package Automaat;

public class Opname {

    private int bedrag;


    public Opname(int bedrag) {
        this.bedrag = bedrag;
    }

    public int getBedrag() {
        return bedrag;
    }
    public void verlaagBedrag(int bedrag){
        this.bedrag -= bedrag;
    }
}
