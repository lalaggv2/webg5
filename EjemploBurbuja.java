package burbuja;

import java.util.HashMap;


public class EjemploBurbuja {

    public static void main(String[] args) {

        BasedeDatosProductos listaProductos = new BasedeDatosProductos();
        
        System.out.println(listaProductos.productoMayor());
        System.out.println(listaProductos.productoMayor1());
    }
}

class BasedeDatosProductos {

    private HashMap<Integer, Producto> listaProductos = new HashMap<Integer, Producto>();

    public BasedeDatosProductos() {

        listaProductos.put(1, new Producto(1, "Manzanas", 5000.0, 25));
        listaProductos.put(2, new Producto(2, "Limones", 2300.0, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700.0, 33));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300.0, 5));
        listaProductos.put(5, new Producto(5, "Tomates", 2100.0, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100.0, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500.0, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 3500.0, 80));
        listaProductos.put(10, new Producto(10, "Jamon", 15000.0, 10));
    }

    public String productoMayor(){
        String nombre = "";
        double precio = 0;
        for (Producto x: listaProductos.values()){
            if(x.getPrecio() > precio){
                nombre = x.getNombre();
                precio = x.getPrecio();
            }
        }
        return nombre;
    }
    
    public String productoMayor1(){        
        String nombre = listaProductos.values().iterator().next().getNombre();
        double precio = listaProductos.values().iterator().next().getPrecio();
        for (Producto producto: listaProductos.values()) {
            if (producto.getPrecio() > precio){
                nombre = producto.getNombre();
                precio = producto.getPrecio();
            }
        }
        return nombre;
    }
}

class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;

    public Producto(int codigo, String nombre, double precio, int inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
}
