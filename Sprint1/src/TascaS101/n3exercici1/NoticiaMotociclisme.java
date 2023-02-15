package TascaS101.n3exercici1;

public class NoticiaMotociclisme extends Noticia{
    private String equip;
    public NoticiaMotociclisme(String titular, int puntacio, int preu, String equip) {
        super(titular, puntacio, preu);
        this.equip = equip;
    }

    @Override
    public void calcularPreuNoticia() {
        int preuInicial = 100;
        int honYam = 50;
    }
}
