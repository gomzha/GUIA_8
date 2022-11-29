//
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//        salir, se mostrará todos los perros guardados en el ArrayList.


//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//        la lista ordenada.
import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> razasPerros = new ArrayList();
        String pregunta, razaAEliminar;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean encontro = false;

        do {
            System.out.println("Ingrese una raza de perro!");
            razasPerros.add(leer.next());
            System.out.println("Quiere seguir cargando datos? S/N");
            pregunta = leer.next();
        }while(pregunta.equals("S"));

        for (String raza : razasPerros) {
            System.out.println("raza: " + raza);

        }


        System.out.println("Elimine la raza que desee: ");
        razaAEliminar = leer.next();

        Iterator iterator = razasPerros.iterator();

        while (iterator.hasNext()){
            if (iterator.next().equals(razaAEliminar)){
                iterator.remove();
                encontro = true;
            }
        }
        if (!encontro){
            System.out.println("No se encontró la raza en la lista");
        }

        for (String raza : razasPerros) {
            System.out.println("raza: " + raza);

        }


        System.out.println("__________________ordenado_____________: ");

        Collections.sort(razasPerros);

        for (String raza : razasPerros) {
            System.out.println("raza: " + raza);

        }

    }
}