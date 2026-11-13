public abstract class Figura {//Clase abstracta
    protected double area;

    public Figura() {//Constructor
    }

    public abstract void calcularArea();//Metodo abstracto

    public void mostrarArea(){//Metodo concreto
        System.out.println("El area de la figura es: "+area);
    }

}
