package Servicio;

import Entidad.Pais;

import java.sql.SQLOutput;
import java.util.*;

public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPais(){
        TreeSet<Pais> paisTreeSet = new TreeSet(Pais.paisComparator);
        String seguir, paisNombre;

        do{
            System.out.println("Ingrese un país: ");
            paisNombre = leer.next();
            paisTreeSet.add(new Pais(paisNombre));

            System.out.println("Desea agregar otro país? S/N");
            seguir = leer.next();
        }while(seguir.equals("S"));

        mostrarPaises(paisTreeSet);

        System.out.println("Desea quitar un País? S/N");
        seguir = leer.next();
     if(seguir.equals("S")){
         quitarPais(paisTreeSet);
     };
    }

    private void quitarPais(TreeSet<Pais> paisTreeSet) {

        String paisAQuitar, paisAQuitar2;
        boolean encontro = false;
        System.out.println("Ingrese nombre del país a quitar: ");
        paisAQuitar = leer.next();
        System.out.println("paisAQuitar: " + paisAQuitar);

        Iterator<Pais> iterator = paisTreeSet.iterator();

        while (iterator.hasNext()){
            if (iterator.next().getNombrePais().equals(paisAQuitar)){
                iterator.remove();
                encontro = true;
            }
        }
        if (!encontro){
            System.out.println("No se encontró el país en la lista");
        }

        mostrarPaises(paisTreeSet);
    }

    private void mostrarPaises(TreeSet<Pais> paisTreeSet) {
        System.out.println("Se muestra los paises ordenados: ");

        for (Pais nombre : paisTreeSet) {

            System.out.println("Pais: " + nombre.getNombrePais());
            
        }
        
    }
}
