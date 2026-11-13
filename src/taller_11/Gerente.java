package taller_11;

public class Gerente extends Empleado{

    public Gerente(double salario){
        nombre="taller_11.Gerente";
        this.salario=salario;
    }

    @Override
    public void calcularSalario() {
        mostrarDetalles();
    }
}
