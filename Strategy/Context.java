package Strategy;

public class Context {

    // No debe crear instancias concretas para no romper el proposito del patrón.
    private InterfazStrategy strategy; //Será la estrategia  a la que el context tiene referencia.

    public Context() {
        //se crea el context.
    }

    public void setStrategy(InterfazStrategy strategy) {
        this.strategy = strategy; //Se referencia una estrategia.
    }

    public void ejecutarStrategy() {
        strategy.detallesDelTratamiento(); //Se ejecuta la estrategia.
    }

}
