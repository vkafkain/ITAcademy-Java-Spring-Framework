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
        int preuInicial = 300;
        int champions = 100;
        int barMad = 100;
        int ferBen = 50;
    }
}
