package Servicio;

import Entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {
        ArrayList<Alumno> arrayListAlumnoServicio = new ArrayList<>();
        //Alumno alu = new Alumno();
        String nombre, continuo;
        Integer[] notas = new Integer[3];

        do {
            System.out.printf("Ingrese el nombre del Alumno: ");
            nombre = leer.next();
            System.out.printf("Ingrese nota 1: ");
            notas[0] = leer.nextInt();
            System.out.printf("Ingrese nota 2: ");
            notas[1] = leer.nextInt();
            System.out.printf("Ingrese nota 3: ");
            notas[2] = leer.nextInt();

            arrayListAlumnoServicio.add(new Alumno(nombre, notas));

            System.out.printf("Quiere ingresar otro alumno? ");
            continuo = leer.next();
        } while (continuo.equals("S"));

        return arrayListAlumnoServicio;
    }

    public void notaFinal(Alumno alumno ) {
        double total = 0;

            for(int i = 0 ; i < alumno.getNotas().length; i++){
                total += alumno.getNotas()[i];
            }
            total = total / alumno.getNotas().length;
        System.out.println("El promedio es : " + total);

        }





}
