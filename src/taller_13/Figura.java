package taller_13;

public abstract class Figura { //Clase abstracta

    protected double area;
    abstract void calcularArea(); //Metodo abstracto

    void mostrarArea(){
        System.out.println("Area: "+area);
    };
}
