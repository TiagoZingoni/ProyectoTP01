
import ExecutorRunnable.Animales;
import ExecutorRunnable.GestorVeterinario;

public class main {

    public static void main(String[] args) {
        Animales animales = new Animales(); //Crea la cola animales
        GestorVeterinario gestor = new GestorVeterinario();
        gestor.IniciarVeterinarios(animales);
    }
}
