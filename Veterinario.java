import Strategy.*;
//Cada veterinario es cliente del context que crean
public class Veterinario implements Runnable{
    String name;
    Cola colaAnimales; //Recurso compartido

    //Cada veterinario tiene cada estrategia
    TratamientoPerro tPerro = new TratamientoPerro();
    TratamientoGato tGato = new TratamientoGato();
    TratamientoTucan tTucan = new TratamientoTucan();
    TratamientoTiburon tTiburon = new TratamientoTiburon();
    TratamientoHipopotamo tHipopotamo = new TratamientoHipopotamo();
    TratamientoAlacran tAlacran = new TratamientoAlacran();
    TratamientoJirafa tJirafa = new TratamientoJirafa();
    TratamientoElefante tElefante = new TratamientoElefante();
    TratamientoSerpiente tSerpiente = new TratamientoSerpiente();
    TratamientoLeon tLeon = new TratamientoLeon();

    Context context = new Context();
    /*Cada veterinario tiene un context en el que cambian de tratamiento 
    según quien llega.*/
    
    public Veterinario(String nombre, Animales animales){
        this.name = nombre; //Nombre del veterinario
        this.colaAnimales = animales.getCola(); //Objeto compartido
    }
    
    @Override
    public void run() {
        Object animal = colaAnimales.obtenerFrente(); //Se obtiene al animal de la cola.
        colaAnimales.sacar(); //Saca el animal de la cola.
        switch(animal.toString()){
            case "1":
                context.setStrategy(tPerro);
                context.ejecutarStrategy();
                break;
            case "2":
                context.setStrategy(tGato);
                context.ejecutarStrategy();
                break;
            case "3":
                context.setStrategy(tTucan);
                context.ejecutarStrategy();
                break;
            case "4":
                context.setStrategy(tTiburon);
                context.ejecutarStrategy();
                break;
            case "5":
                context.setStrategy(tHipopotamo);
                context.ejecutarStrategy();
                break;
            case "6":
                context.setStrategy(tAlacran);
                context.ejecutarStrategy();
                break;
            case "7":
                context.setStrategy(tJirafa);
                context.ejecutarStrategy();
                break;
            case "8":
                context.setStrategy(tElefante);
                context.ejecutarStrategy();
                break;
            case "9":
                context.setStrategy(tSerpiente);
                context.ejecutarStrategy();
                break;
            case "10":
                context.setStrategy(tLeon);
                context.ejecutarStrategy();
                break;
        }

    }
}

