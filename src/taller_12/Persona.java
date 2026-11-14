package taller_12;

public class Persona implements Trabajador, Hablador{ //Clase que implementa interfaces

    @Override //Implementacion del metodo abstracto
    public void trabajar() {
        System.out.println("La persona está trabajando");
    }

    @Override //Implementacio del metodo abstracto
    public void hablar(){
        System.out.println("La persona está hablando");
    }

}
