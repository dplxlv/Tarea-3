public class Main {
    public static void main(String[] args) {

        Productos p1 = new Productos("Laptop", 1200.50, 5);

        Productos p2 = new Productos();

        Productos p3 = new Productos(true);

        p3.nombre = "Mouse";
        p3.precio = 25.99;
        p3.cantidad = 10;

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
    }
}