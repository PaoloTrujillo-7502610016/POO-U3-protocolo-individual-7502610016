public class Gerente extends Empleado{

    public Gerente(double salario){
        nombre="Gerente";
        this.salario=salario;
    }

    @Override
    public void calcularSalario() {
        mostrarDetalles();
    }
}
