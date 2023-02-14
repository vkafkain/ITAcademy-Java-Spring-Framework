package TascaS101.n1exercici1;

public class InstrumentCorda extends Instrument{
    public InstrumentCorda(String name, int preu) {
        super(name, preu);
    }
    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de corda");

    }
}
