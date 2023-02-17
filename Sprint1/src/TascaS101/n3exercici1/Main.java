package TascaS101.n3exercici1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean sortir = false;
        int opcio;
        List<Redactor> redactores = new ArrayList<>();

        while (!sortir) {
        System.out.println("1.- Introduir redactor");
        System.out.println("2.- Eliminar redactor");
        System.out.println("3.- Introduir notícia a un redactor");
        System.out.println("4.- Eliminar notícia");
        System.out.println("5.- Mostrar totes les notícies per redactor");
        System.out.println("6.- Calcular puntuació de la notícia");
        System.out.println("7.- Calcular preu-notícia");
        System.out.println("8.- Sortir");
        System.out.println("Indica el número d'operació");

        opcio = sc.nextInt();

        switch (opcio){
            case 1:
                System.out.println("Introdueix el nom del redactor:");
                String nom = sc.next();
                System.out.println("Introduiex el DNI del redactor");
                String dni = sc.next();
                Redactor redactor = new Redactor(nom, dni);
                redactores.add(redactor);
                System.out.println("Se ha creat un nou redactor amb el nom: " + redactor.getNom() + " i DNI " + redactor.getDNI());
                break;
            case 2:
                System.out.println("Introdueix DNI del redactor que desitjar eliminar");
                String dniEliminat = sc.next();
                redactores.removeIf(n -> n.getDNI().equals(dniEliminat));
            case 3:
                System.out.println();


        }


        }





    }
}
