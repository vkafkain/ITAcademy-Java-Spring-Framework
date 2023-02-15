package TascaS101.n3exercici1;

public class NoticiaTenis extends Noticia{
    private String competicio;
    private String tenista;

    public NoticiaTenis(String titular, int puntacio, int preu, String competicio, String tenista) {
        super(titular, puntacio, preu);
        this.competicio = competicio;
        this.tenista = tenista;
    }

}
