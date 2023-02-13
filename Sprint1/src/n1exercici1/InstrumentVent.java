package n1exercici1;

public class InstrumentVent extends Instrument{
    public InstrumentVent(String name, int preu) {
        super(name, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de perscussió");
    }
}
