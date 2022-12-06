package Entidad;

import java.util.Comparator;

public class Tienda {

    private String producto;
    private double precio;

    public Tienda() {
    }

    public Tienda(double precio) {
        this.precio = precio;
    }

    public Tienda(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public static Comparator<Tienda> compararProd = new Comparator<Tienda>() {
        @Override
        public int compare(Tienda o1, Tienda o2) {
            return o1.getProducto().compareTo(o2.getProducto());
        }
    };


    @Override
    public String toString() {
        return "producto='" + producto + "', Precio= $" + precio;
    }


}
