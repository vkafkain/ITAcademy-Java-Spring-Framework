package TascaS101.n3exercici1;

public abstract class Noticia {
    private String titular;
    private String text = null;
    private int puntacio;
    private int preu;

    public Noticia(String titular, int puntacio, int preu) {
        this.titular = titular;
        this.puntacio = puntacio;
        this.preu = preu;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntacio() {
        return puntacio;
    }

    public void setPuntacio(int puntacio) {
        this.puntacio = puntacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Noticies{" +
                "titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntacio=" + puntacio +
                ", preu=" + preu +
                '}';
    }

    public abstract void calcularPreuNoticia();
    public abstract void calcularPuntuacioNoticia();

}
