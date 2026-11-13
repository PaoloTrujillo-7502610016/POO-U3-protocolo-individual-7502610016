
public class Main {

    static void main(String[] args) {
        System.out.println("\n***Inicio del Programa***\n");

        System.out.println("Ejercicio 1:");

        Circulo circulo = new Circulo(32);
        circulo.calcularArea();
        Rectangulo rectangulo = new Rectangulo(5,10);
        rectangulo.calcularArea();

        System.out.println("\nEjercicio 2:");

        Gerente gerente = new Gerente(5000000);
        gerente.mostrarDetalles();
        Vendedor vendedor = new Vendedor(3350000);
        vendedor.mostrarDetalles();


    }


}