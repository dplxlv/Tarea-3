public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}