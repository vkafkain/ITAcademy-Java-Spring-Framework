package TascaS101.n3exercici1;

public class NoticiaFutbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;
    public NoticiaFutbol(String titular, int puntacio, int preu, String competicio, String club, String jugador) {
        super(titular, puntacio, preu);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {

        int preu = 300;

        if ( competicio.equals("Lliga de campions")) {
            preu += 100;
        }
        if (club.equals("Barça") || club.equals("Madrid")){
            preu += 100;
        }
        if(jugador.equals("Ferran Torres") || jugador.equals("Benzema")){
            preu += 50;
        }

        System.out.println(preu + " €");
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 5;

        if ( competicio.equals("Lliga de campions")) {
            puntuacio += 3;
        }if ( competicio.equals("Lliga")) {
            puntuacio += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid")){
            puntuacio += 1;
        }
        if(jugador.equals("Ferran Torres") || jugador.equals("Benzema")){
            puntuacio += 1;
        }

        System.out.println(puntuacio + " punts");
    }
}
