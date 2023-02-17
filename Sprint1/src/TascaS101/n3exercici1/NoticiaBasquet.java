package TascaS101.n3exercici1;

public class NoticiaBasquet extends Noticia{
    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, int puntacio, int preu) {
        super(titular, puntacio, preu);
    }

    public void calcularPreuNoticia() {

        int preu = 250;

        if ( competicio.equals("Eurolliga")) {
            preu += 75;
        }
        if (club.equals("Barça") || club.equals("Madrid")){
            preu += 75;
        }

        System.out.println(preu + " €");
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 4;

        if ( competicio.equals("Eurolliga")) {
            puntuacio += 3;
        }if ( competicio.equals("ACB")) {
            puntuacio += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid")){
            puntuacio += 1;
        }

        System.out.println(puntuacio + " punts");
    }
}
