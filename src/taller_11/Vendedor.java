package taller_11;

public class Vendedor extends Empleado{

    public Vendedor(double salario){
        nombre="vendedor";
        this.salario=salario;
    }

    @Override
    public void calcularSalario(){
        mostrarDetalles();
    }
}
