package ExecutorRunnable;
//ExecuteService

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GestorVeterinario {

    //ExecuteService que gestiona los hilos Veterinarios
    ExecutorService executor = Executors.newFixedThreadPool(2);

    /*Define la cantidad de hilos que se van a ejecutar en paralelo 
    (Veterinarios atendiendo a la vez)*/
    public void IniciarVeterinarios(Animales colaAnimales) {
        //Se inician los hilos Veterinarios.
        executor.execute(new Veterinario("Dr. ", colaAnimales));
        executor.execute(new Veterinario("Dr. Dhammer", colaAnimales));
        executor.shutdown();
    }
}
