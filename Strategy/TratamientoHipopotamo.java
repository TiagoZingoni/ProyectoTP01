package Strategy;
public class TratamientoHipopotamo implements InterfazStrategy{

    public void detallesDelTratamiento() {
        /*
         * Se comienza a ejecutar una simulación de lo que podría hacer el tratamiento en cuestión
         * imprimiendo mensajes por consola cada determinado tiempo. Al terminar, para determinar 
         * una conclusión del tratamiento, hicimos que por medio de un numero aleatorio se elija 
         * un mensaje en concreto por consola. 
         */
        int random = (int) (Math.random() * 10);
        System.out.println("Comienza el tratamiento del Hipopotamo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le revisa el estomago al Hipopotamo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le revisan las patas al Hipopotamo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le limpia la boca al Hipopotamo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }

        if (random == 1) {
            System.out.println("\u001B[35mEl Hipopotamo se escapó\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else if (random > 1 && random < 5) {
            System.out.println("\u001B[32mEl Hipopotamo se salvó\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else {
            System.out.println("\u001B[31mEl Hipopotamo murió\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        }
    }
}
