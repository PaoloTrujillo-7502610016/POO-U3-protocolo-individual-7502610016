package taller_11;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado() {
    }

    public abstract void calcularSalario();

    public void mostrarDetalles(){
        System.out.println("El sueldo del "+nombre+" es: $"+salario);
    }

}
