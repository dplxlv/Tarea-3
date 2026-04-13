public class Mascota {

    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}