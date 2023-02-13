package n1exercici1;

public class InstrumentPersussio extends Instrument{

    public InstrumentPersussio(String name, int preu) {
        super(name, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de persussió");
    }
}
