package Entidad;

import java.util.Arrays;

public class Alumno {

    private String nombre;
    private Integer [] notas= new Integer [3];

    public Alumno() {
    }

    public Alumno(String nombre, Integer[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }


    @Override
    public String toString() {
        return "AlumnoServicio{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
