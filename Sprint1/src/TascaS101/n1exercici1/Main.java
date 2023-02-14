package TascaS101.n1exercici1;

public class Main {
    public static void main(String[] args) {
      //Càrrega de la classe provocada per la creació de la primera instancia d'aquesta
        InstrumentVent oboe = new InstrumentVent("oboe",300);
        InstrumentCorda guitarra = new InstrumentCorda("guitarra",300);
        InstrumentPersussio bateria = new InstrumentPersussio("bateria",300);
        oboe.tocar();
        guitarra.tocar();
        bateria.tocar();

        //Càrrega de la classe provocada per el accés a un membree estàtic d'aquesta
        int id = Instrument.id;
        System.out.println("Número instruments: "  + id);
    }
}
