package TascaS101.n3exercici1;

public class NoticiaTenis extends Noticia{
    private String competicio;
    private String tenista;
    public NoticiaTenis(String titular, int puntacio, int preu, String competicio, String tenista) {
        super(titular, puntacio, preu);
        this.competicio = competicio;
        this.tenista = tenista;
    }

    @Override
    public void calcularPreuNoticia() {
        int preu = 150;
        if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic")){
            preu += 100;
        }
        System.out.println(preu + " €");
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int puntuacio = 4;
        if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic")){
            puntuacio += 3;
        }
        System.out.println(puntuacio + " punts");
    }
}
