import Entidad.Libro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Libro libro = new Libro("009pepe7");
        ArrayList<Libro> librosArr = new ArrayList();


        librosArr.add(libro);
        librosArr.add(new Libro("010pepe7"));
        librosArr.add(new Libro("001pepe9"));

        System.out.println("libros: " + librosArr );
        System.out.println("___________________");
        System.out.println("libroArr size : " + librosArr.size());
        ;

        for (Libro titulo : librosArr) {
            System.out.println("titulo; " + titulo);
            
        }

        librosArr.sort(Libro.compararLibro);
        System.out.println("___________________");

        for (Libro titulo : librosArr) {
            System.out.println("titulo; " + titulo);

        }
            
        


    }



}