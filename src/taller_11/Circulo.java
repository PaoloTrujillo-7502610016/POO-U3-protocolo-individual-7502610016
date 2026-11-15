package taller_11;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        nombre = "Circulo";
        this.radio = radio;
    }
    @Override
    public void calcularArea() {
        area=Math.PI*Math.pow(radio,2);
        mostrarArea();
    }

    //Ejercicio 3: sobreescribir metodo concreto:
    @Override
    public void metodoConcreto() {
        System.out.println("Se ha sobreescito el metodo concreto del "+nombre);
    }

}
