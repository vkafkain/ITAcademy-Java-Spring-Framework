package n1exercici2;

public class Cotxe {
    public static final String marca = "audi";
    public static String model;
    public final int potencia = 300;

    public Cotxe(String model, int potencia) {
        this.model = model;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}
