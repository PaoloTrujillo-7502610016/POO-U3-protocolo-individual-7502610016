package taller_12;

public class Animal implements Volador, Nadador, Hablador{

    @Override
    public void nadar() {
        System.out.println("El animal esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("El animal esta volando");
    }

    /*Ejemplo ejercicio 3:*/
    //@Override /*Se observa un error de complicaion al convertir a comentario el codigo del metodo implementado*/
    //public void hablar() { /*El animal no tiene una logica para hablar, lo cual no tiene sentido*/
    //    System.out.println("Un animal no puede hablar");
    //}

}
