package TascaS101.n2exercici1;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(int num){
        System.out.println("Estàs trucant al  " + num);
    }

}
