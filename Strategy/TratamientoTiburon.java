package Strategy;
public class TratamientoTiburon implements InterfazStrategy{
    public void detallesDelTratamiento() {
        int random = (int) (Math.random() * 10);
        System.out.println("Comienza el tratamiento del Tiburon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se revisan las aletas del Tiburon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le da anestesia al Tiburon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }
        System.out.println("Se le revisan los dientes al Tiburon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se rompió todo");
        }

        if (random == 1) {
            System.out.println("\u001B[35mEl Tiburon se ¿¿escapó??\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else if (random > 1 && random < 5) {
            System.out.println("\u001B[32mEl Tiburon esta sano\u001B[0m");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        } else {
            System.out.println("\u001B[31mEl Tiburon se alimentó...\u001B[0m");
            if (random == 9) {
                System.out.println("\u001B[32mSe busca un nuevo ayudante, el Tiburon está sano\u001B[0m");
            } else {
                System.out.println("\u001B[32mEl Tiburon está sano... y alimentado\u001B[0m");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se rompió todo");
            }
        }
    }
}
