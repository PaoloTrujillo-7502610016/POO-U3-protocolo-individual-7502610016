package taller_11;

public class Gerente extends Empleado{

    public Gerente(double salario){
        nombre="Gerente";
        this.salario=salario;
    }

    @Override
    public void calcularSalario() {
        salario=salario+salario*0.2;
    }

}
