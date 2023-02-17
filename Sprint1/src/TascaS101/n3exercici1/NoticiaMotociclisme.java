package TascaS101.n3exercici1;

public class NoticiaMotociclisme extends Noticia{
    private String equip;
    public NoticiaMotociclisme(String titular, int puntacio, int preu, String equip) {
        super(titular, puntacio, preu);
        this.equip = equip;
    }


    @Override
    public void calcularPreuNoticia() {
        int preu = 100;
        if (equip.equals("Honda") || equip.equals("Yamaha")){
            preu += 50;
        }
        System.out.println(preu + " €");
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 3;
        if (equip.equals("Honda") || equip.equals("Yamaha")){
            puntuacio += 3;
        }
        System.out.println(puntuacio + " punts");
    }
}
