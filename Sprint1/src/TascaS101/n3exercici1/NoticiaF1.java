package TascaS101.n3exercici1;

public class NoticiaF1 extends Noticia{
    private String escuderia;
    public NoticiaF1(String titular, int puntacio, int preu, String escudera) {
        super(titular, puntacio, preu);
        this.escuderia = escuderia;
    }

    @Override
    public void calcularPreuNoticia() {
        int preu = 100;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")){
            preu += 50;
        }
        System.out.println(preu + " €");
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 4;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")){
            puntuacio += 2;
        }
        System.out.println(puntuacio + " punts");
    }
}
