package TascaS101.n3exercici1;

public class NoticiaF1 extends Noticia{
    private String escudera;

    public NoticiaF1(String titular, int puntacio, int preu, String escudera) {
        super(titular, puntacio, preu);
        this.escudera = escudera;
    }
}
