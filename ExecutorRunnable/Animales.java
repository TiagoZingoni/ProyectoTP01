package ExecutorRunnable;

import Auxiliares.*;

public class Animales {
    //Crea una cola de animales, esta es el recurso compartido entre veterinarios.

    Cola colaAnimales = new Cola();

    public Animales() {
        for (int i = 0; i < 30; i++) {
            //Se crea una cola de animales con 30 animales aleatorios.
            int tipoAnimal = (int) (Math.random() * 10) + 1;
            colaAnimales.poner(tipoAnimal);
            switch (tipoAnimal) {
                case 1:
                    System.out.println("Llegó un perro");
                    break;
                case 2:
                    System.out.println("Llegó un gato");
                    break;
                case 3:
                    System.out.println("Llegó un tucan");
                    break;
                case 4:
                    System.out.println("Llegó un tiburon");
                    break;
                case 5:
                    System.out.println("Llegó un hipopotamo");
                    break;
                case 6:
                    System.out.println("Llegó un alacran");
                    break;
                case 7:
                    System.out.println("Llegó una jirafa");
                    break;
                case 8:
                    System.out.println("Llegó un elefante");
                    break;
                case 9:
                    System.out.println("Llegó una serpiente");
                    break;
                case 10:
                    System.out.println("Llegó un leon");
                    break;
            }
        }
    }

    public Cola getCola() {
        return colaAnimales;
    }
}
