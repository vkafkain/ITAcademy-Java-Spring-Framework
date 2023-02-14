package TascaS101.n1exercici2;

public class Main {
    public static void main(String[] args) {

        Cotxe audiR4 = new Cotxe("r4", 300);

        //static final
    String marca = Cotxe.marca;
        System.out.println(marca);

        //static
    String model = Cotxe.model;
        System.out.println(model);

        //final
        System.out.println(audiR4.potencia);

        //metode static
        Cotxe.frenar();

        //metoda no static
        audiR4.accelerar();
    }

}

