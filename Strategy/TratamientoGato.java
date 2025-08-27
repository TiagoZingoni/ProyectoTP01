package Strategy;

public class TratamientoGato implements InterfazStrategy {

    public void detallesDelTratamiento() {
        int random = (int) (Math.random() * 10);
        System.out.println("Comenzó el tratamiento para el gato");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("El tratamiento del gato continúa");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        if (random > 5) {
            System.out.println("\u001B[32mEl tratamiento del Gato terminó exitosamente\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else {
            System.out.println("\u001B[31mEl Gato murió\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        }
    }
}
