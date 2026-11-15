package taller_13;

public class Pato implements Nadador, Volador {

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volando");
    }

}
