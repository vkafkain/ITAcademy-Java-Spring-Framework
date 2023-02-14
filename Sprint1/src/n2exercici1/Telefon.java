package n2exercici1;

public class Telefon {
    public String marca;
    public String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(int num){
        System.out.println("Estàs trucant al  " + num);
    }

}
