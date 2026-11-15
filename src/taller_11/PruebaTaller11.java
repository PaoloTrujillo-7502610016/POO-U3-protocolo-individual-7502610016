package taller_11;

public class PruebaTaller11 {

    static void main(String[] args) {
        System.out.println("\n***Inicio del Programa***\n");

        /*Ejercicio 1*/
        System.out.println("Ejercicio 1:");
        Circulo circulo = new Circulo(32);
        circulo.calcularArea();
        Rectangulo rectangulo = new Rectangulo(5,10);
        rectangulo.calcularArea();

        /*Ejercicio 2*/
        System.out.println("\nEjercicio 2:");
        Gerente gerente = new Gerente(5000000);
        gerente.calcularSalario();
        gerente.mostrarDetalles();
        Vendedor vendedor = new Vendedor(3350000);
        vendedor.calcularSalario();
        vendedor.mostrarDetalles();

        /*Ejercicio 3*/
        System.out.println("\nEjercicio 3:");
        //taller_11.Empleado empleado = new taller_11.Empleado(); /* Instancia de una clase abstracta */
        circulo.metodoConcreto();//Sobreescritura de metodo concreto
        rectangulo.metodoConcreto();//Sobreescritura de metodo concreto

    }


}