package taller_13;

public class Rectangulo extends Figura{
    String nombre="Rectangulo";
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea() {
        area = base*altura;
    }

    @Override
    void mostrarArea(){
        System.out.println("El area del "+nombre+" es: "+area);
    }
}
