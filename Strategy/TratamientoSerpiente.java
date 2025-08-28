package Strategy;

public class TratamientoSerpiente implements InterfazStrategy {

    public void detallesDelTratamiento() {
        /*
         * Se comienza a ejecutar una simulación de lo que podría hacer el tratamiento en cuestión
         * imprimiendo mensajes por consola cada determinado tiempo. Al terminar, para determinar 
         * una conclusión del tratamiento, hicimos que por medio de un numero aleatorio se elija 
         * un mensaje en concreto por consola. 
         */
        int random = (int) (Math.random() * 10);
        System.out.println("Comienza el tratamiento de la Serpiente");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se revisan las patas de la Serpiente");
        System.out.println("No se encontraron patas");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le revisan las escamas a la Serpiente");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le revisan los colmillos a la Serpiente");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }

        if (random == 1) {
            System.out.println("\u001B[35mLa Serpiente se escapó\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else if (random > 1 && random < 5) {
            System.out.println("\u001B[32mLa Serpiente se salvó\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else {
            System.out.println("\u001B[32mLa Serpiente picó al ayudante\u001B[0m");
            System.out.println("\u001B[32mNo es venosa, ambos sobreviven\u001B[0m");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        }
    }
}
