package taller_11;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        nombre="taller_11.Rectangulo";
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area=base*altura;
        mostrarArea();
    }

    //Ejercicio 3: sobreescribir metodo concreto:
    @Override
    public void metodoConcreto() {
        System.out.println("Se ha sobreescito el metodo concreto del "+nombre);
    }

}
