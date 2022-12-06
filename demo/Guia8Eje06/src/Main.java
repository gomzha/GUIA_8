//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//        productos que venderemos y el precio que tendrán. Además, se necesita que la
//        aplicación cuente con las funciones básicas.
//        Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//        eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//        Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//        Realizar un menú para lograr todas las acciones previamente mencionadas.


import Servicio.MapSort;
import Servicio.TiendaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MapSort sort = new MapSort();
        sort.start();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio tiendaServicio = new TiendaServicio();



        int opcion;

        do {
            System.out.println("Ingrese la opción que desee: ");
            System.out.println("01- Ingresar productos:");;
            System.out.println("02- Mostrar productos:");;
            System.out.println("03- Eliminar productos:");;
            System.out.println("04- Modificar producto:");;
            System.out.println("05- SALIR");;
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    tiendaServicio.introducirProducto();
                    break;
                case 2:
                    tiendaServicio.mostrarProductos();
                    break;
                case 3 :
                    tiendaServicio.eliminarProducto();
                    break;
                case 4 :
                    tiendaServicio.modificarPrecioProducto();
                    break;
                default:
                    if(opcion != 5){
                        System.out.println("Opción incorrecta");
                    }
            }
        }while(opcion != 5);

    }
}