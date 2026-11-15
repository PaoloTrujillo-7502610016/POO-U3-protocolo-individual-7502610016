package taller_12;

public class PruebaTaller12 {


    static void main(String[] args) {
        System.out.println("\n***Iniciando Taller 12***\n");

        /*Ejercicio 1*/
        System.out.println("\nEjercicio 1:");
        Persona persona = new Persona();
        persona.trabajar();
        persona.hablar();

        /*Ejercicio 2*/
        System.out.println("\nEjercicio 2:");
        Animal animal = new Animal();
        animal.volar();
        animal.nadar();

        System.out.println("\nEjercicio 3:");
        animal.hablar(); //Instruccion no tienen sentido porque un aminal no habla

    }
}
