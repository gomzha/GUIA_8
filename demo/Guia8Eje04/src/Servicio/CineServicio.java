package Servicio;

import Entidad.Cine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CineServicio {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");



    public void crearPelicula(){
        Cine pelicula = new Cine();
        ArrayList<Cine> cineArrayList = new ArrayList<>();
        String nombre, director, continuar;
        double duracion;

        do {
            System.out.println("Ingrese el nombre de la película");
            nombre = leer.next();
            System.out.println("Ingrese el director de la película");
            director = leer.next();
            System.out.println("Ingrese la duracion de la película");
            duracion = leer.nextDouble();

            cineArrayList.add(new Cine(nombre, director, duracion));

            System.out.println("Desea ingresar otra pelicula? S/N");
            continuar = leer.next();

        }while(continuar.equals("S"));

        mostrarPeliculas(cineArrayList);
        mostrarPeliculasDuracionMayorUnaHora(cineArrayList);
        System.out.println("---------------ordenarPeliculaPorDuracionMayorAMenor-----------------");

        ordenarPeliculaPorDuracionMayorAMenor(cineArrayList);
        System.out.println("---------------ordenarPeliculaProDuracionMenorAMayor-----------------");

        ordenarPeliculaProDuracionMenorAMayor(cineArrayList);
        System.out.println("---------------ordenarPeliculaPorTitulo-----------------");

        ordenarPeliculaPorTitulo(cineArrayList);
        System.out.println("---------------ordenarPeliculaPorDirector-----------------");

        ordenarPeliculaPorDirector(cineArrayList);


    }

    private void ordenarPeliculaPorDirector(ArrayList<Cine> cineArrayList) {

        cineArrayList.sort(compararPorduracionPorDirector);
        System.out.println("---------------compararPorduracionPorDirector-----------------");

        for (Cine pelicula : cineArrayList) {
            System.out.println("titulo; " + pelicula.toString());
        }


    }

    private void ordenarPeliculaPorTitulo(ArrayList<Cine> cineArrayList) {
        cineArrayList.sort(compararPorduracionPorTitulo);
        System.out.println("---------------compararPorduracionPorTitulo-----------------");

        for (Cine pelicula : cineArrayList) {
            System.out.println("titulo; " + pelicula.toString());
        }
    }

    private void ordenarPeliculaProDuracionMenorAMayor(ArrayList<Cine> cineArrayList) {

        cineArrayList.sort(compararPorduracionMenorAMayor);
        System.out.println("---------------compararPorduracionMenorAMayor-----------------");

        for (Cine pelicula : cineArrayList) {
            System.out.println("titulo; " + pelicula.toString());
        }
    }

    private void ordenarPeliculaPorDuracionMayorAMenor(ArrayList<Cine> cineArrayList) {

        cineArrayList.sort(compararPorduracionMayorAMenor);
        System.out.println("---------------compararPorduracionMayorAMenor-----------------");

        for (Cine pelicula : cineArrayList) {
            System.out.println("titulo; " + pelicula.toString());
        }
    }

    private void mostrarPeliculasDuracionMayorUnaHora(ArrayList<Cine> cineArrayList) {

        System.out.println("---------------mostrarPeliculasDuracionMayorUnaHora-----------------");

        for (Cine pelicula: cineArrayList
        ) {
            if(pelicula.getDuracion()>1)
            System.out.println(pelicula.toString());
        }

    }

    private void mostrarPeliculas(ArrayList<Cine> cineArrayList) {


        System.out.println("---------------mostrarPeliculas-----------------");

        for (Cine pelicula: cineArrayList
             ) {
            System.out.println(pelicula.toString());
        }

    }

public static Comparator<Cine> compararPorduracionMayorAMenor = new Comparator<Cine>() {

    @Override

    public int compare(Cine o1, Cine o2) {
        return Double.compare(o2.getDuracion(), o1.getDuracion());
    }
};

    public static Comparator<Cine> compararPorduracionMenorAMayor = new Comparator<Cine>() {
        @Override
        public int compare(Cine o1, Cine o2) {
            return Double.compare(o1.getDuracion(), o2.getDuracion());
        }
    };

    public static Comparator<Cine> compararPorduracionPorDirector = new Comparator<Cine>() {
        @Override
        public int compare(Cine o1, Cine o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

    public static Comparator<Cine> compararPorduracionPorTitulo = new Comparator<Cine>() {
        @Override
        public int compare(Cine o1, Cine o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

}
