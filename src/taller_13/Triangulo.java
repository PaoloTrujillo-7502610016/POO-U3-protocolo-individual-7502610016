package taller_13;

public class Triangulo extends Figura{
    String nombre="Triangulo";
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea() {
        area = (base*altura)/2;
    }

    @Override
    void mostrarArea(){
        System.out.println("El area del "+nombre+" es: "+area);
    }
}