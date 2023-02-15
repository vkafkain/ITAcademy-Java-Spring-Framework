package TascaS101.n3exercici1;

import java.util.*;

public class Redactor {
    private String nom;
    private final String DNI;
    private static final int sou = 1500;
    private ArrayList<Noticia> noticias;

    public Redactor(String nom, String dni) {
        this.nom = nom;
        DNI = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void afegirNoticia(Noticia noticia){
        noticias.add(noticia);
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
