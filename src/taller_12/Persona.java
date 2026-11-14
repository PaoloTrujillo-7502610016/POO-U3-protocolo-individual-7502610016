package taller_12;

public class Persona implements Trabajador, Hablador{ //Clase que implementa interfaces

    @Override //Sobreescritura del metodo abstracto
    public void trabajar() {
        System.out.println("La persona está trabajando");
    }

    public void hablar(){
        System.out.println("La persona está hablando");
    }

}
