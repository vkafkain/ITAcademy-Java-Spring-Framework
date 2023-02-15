package TascaS101.n3exercici1;

public class NoticiaBasquet extends Noticia{
    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, int puntacio, int preu) {
        super(titular, puntacio, preu);
    }

    @Override
    public void calcularPreuNoticia() {
        int preuInicial = 250;
        int euroLLiga = 75;
        int barMad = 75;
    }
}
