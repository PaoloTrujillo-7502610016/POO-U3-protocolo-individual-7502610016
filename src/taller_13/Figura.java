package taller_13;

public abstract class Figura { //Clase abstracta

    protected double area;
    abstract void calcularArea(); //Metodo abstracto

    void mostrarArea(){
        System.out.println("Area: "+area);
    };

    /*Ejemplo ejercicio 3*/
//    default void calcularPerimetro(){ /*Metodo predeterminado en una clase abstracta*/
//        System.out.println("Perimetro");
//    }

}
