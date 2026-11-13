public abstract class Figura {//Clase abstracta
    protected double area;
    protected String nombre;

    public Figura() {
    }

    public abstract void calcularArea();//Metodo abstracto

    public void mostrarArea(){//Metodo concreto
        System.out.println("El area del "+nombre+ " es: "+area);
    }

}
