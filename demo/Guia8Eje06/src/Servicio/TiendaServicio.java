package Servicio;

import Entidad.Tienda;

import java.util.*;

public class TiendaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Tienda> tiendaHashMap = new HashMap<>();


    public void introducirProducto() {
        // HashMap<Integer, Tienda> tiendaHashMap = new HashMap<>();
        String nombreProdu, resp;
        double precioProdu;

        do {
            System.out.println("Ingrese el nombre del producto: ");
            nombreProdu = leer.next();
            System.out.println("Ingrese el PRECIO del producto: ");
            precioProdu = leer.nextDouble();
            tiendaHashMap.put(nombreProdu, new Tienda(nombreProdu, precioProdu));

            System.out.println("Desea agregar otro producto? S/N");
            resp = leer.next();
        } while (resp.equals("S"));
        //para los mapas se debe utilizar lo siguiente para acomodar:
        ArrayList<Tienda> prod = new ArrayList(tiendaHashMap.values());
        prod.sort(Tienda.compararProd);
        System.out.println("arrays prod: " + prod.toString());

        // Other
    }

    public void mostrarProductos() {
        System.out.println("Entra acá mostrarProductos");
        for (Map.Entry<String, Tienda> entry : tiendaHashMap.entrySet()
        ) {
            System.out.println("Nombre del prod: " + entry.getKey() + " | Precio del producto: " + entry.getValue().getPrecio());
        }
    }

    public void eliminarProducto() {
        String nombreProdu;
        System.out.println("Ingrese el producto a eliminar: ");
        mostrarProductos();
        nombreProdu = leer.next();
        tiendaHashMap.remove(nombreProdu);
//        Iterator<String> iterator = tiendaHashMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().equals(nombreProdu)) {
//                System.out.println("producto encontrado");
//                iterator.remove();
//            }
//        }
    }

    public void modificarPrecioProducto() {
        String nombreProdu;
        double valorMod;
        boolean econtrado = false;
        System.out.println("Ingrese el producto a Modificar: ");
        mostrarProductos();
        System.out.println("-----------------------... ");
        nombreProdu = leer.next();
        System.out.println("Producto encontrado, ingrese el nuevo valor: ");
        valorMod = leer.nextDouble();
        // hasta aca el tipo puso lo que quiere actualizar.

        // actualizar es: recuperar lo que esta guardado y modificar con lo que el tipo puso.

        var productInMap = tiendaHashMap.get(nombreProdu);

        if (productInMap != null) {
            productInMap.setPrecio(valorMod);
            tiendaHashMap.put(nombreProdu, productInMap);
        }
//        Iterator<String> iterator = tiendaHashMap.keySet().iterator();
//        for (Map.Entry<String, Tienda> entry : tiendaHashMap.entrySet()
//        ) {
//            if (entry.getKey().equals(nombreProdu)) {
//                System.out.println("Producto encontrado, ingrese el nuevo valor: " + entry.getKey() + " | " + entry.getValue());
//                valorMod = leer.nextDouble();
//                tiendaHashMap.put(entry.getKey(), new Tienda(valorMod));
//                econtrado = true;
//            }
//        }
//        if (!econtrado) {
//            System.out.println("Producto no encontrado");
//        }
    }
}
