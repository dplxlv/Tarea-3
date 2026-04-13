public class Celular {

    private String marca;
    private int bateria;

    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Batería: " + bateria + "%");
    }

    public void cargar(int cantidad) {
        bateria += cantidad;
    }
}