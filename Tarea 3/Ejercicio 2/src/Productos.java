public class Productos {
    String nombre;
    double precio;
    int cantidad;

    public Productos(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Productos() {
        this.nombre = "Producto genérico";
        this.precio = 10.0;
        this.cantidad = 1;
    }

    public Productos(boolean vacio) {
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("--------------------------");
    }
}