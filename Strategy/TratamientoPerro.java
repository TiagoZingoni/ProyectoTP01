package Strategy;

public class TratamientoPerro implements InterfazStrategy {

    public void detallesDelTratamiento() {
        /*
         * Se comienza a ejecutar una simulación de lo que podría hacer el tratamiento en cuestión
         * imprimiendo mensajes por consola cada determinado tiempo. Al terminar, para determinar 
         * una conclusión del tratamiento, hicimos que por medio de un numero aleatorio se elija 
         * un mensaje en concreto por consola. 
         */
        int random = (int) (Math.random() * 10);
        System.out.println("Comenzó el tratamiento para el perro");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("El tratamiento del perro continúa");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        if (random > 5) {
            System.out.println("\u001B[32mEl tratamiento del perro terminó exitosamente\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else {
            System.out.println("\u001B[31mEl Perro murió\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        }
    }
}
