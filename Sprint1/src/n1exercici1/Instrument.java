package n1exercici1;

public abstract class Instrument {
    private String name;
    private int preu;
   public static int id;

    public Instrument(String name, int preu) {
        this.name = name;
        this.preu = preu;
        id++;
    }

    public abstract void tocar();
}
