package Entidad;

import java.util.Comparator;

public class Libro {

    private String libroNombre;

    public Libro() {
    }

    public Libro(String libroNombre) {
        this.libroNombre = libroNombre;
    }

    public String getLibroNombre() {
        return libroNombre;
    }

    public void setLibroNombre(String libroNombre) {
        this.libroNombre = libroNombre;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "libroNombre='" + libroNombre + '\'' +
                '}';
    }

    public static  Comparator<Libro> compararLibro = new Comparator<Libro>() {
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.getLibroNombre().compareTo(o2.getLibroNombre());
        }
    };


}
