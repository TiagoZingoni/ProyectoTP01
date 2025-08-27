package Strategy;


public class TratamientoAlacran implements InterfazStrategy {

    public void detallesDelTratamiento() {
        int random = (int) (Math.random() * 10);
        System.out.println("Comienza el tratamiento del Alacrán");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se revisan las patas del Alacrán");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le dan pastillas al Alacrán");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le revisa el aguijón al Alacrán");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }

        if (random == 1) {
            System.out.println("\u001B[35mEl Alacrán se escapó\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else if (random > 1 && random < 5) {
            System.out.println("\u001B[32mEl Alacrán se salvó\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else {
            System.out.println("\u001B[31mEl Alacrán picó al ayudante\u001B[0m");
            if (random == 9) {
                System.out.println("\u001B[31mEl ayudante no sobrevivió, el Alacrán si\u001B[0m");
            } else {
                System.out.println("\u001B[32mEl ayudante sobrevivió, el Alacrán también\u001B[0m");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        }
    }
}
