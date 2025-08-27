package Auxiliares;

/**
 *
 * @author tiago.zingoni
 */
public class Cola {

    private Nodo frente;
    private Nodo fin;

    //Constructor
    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean poner(Object elemento) {
        //agrega el elemento dado a la cola.
        Nodo nodoNuevo = new Nodo(elemento, null);
        if (frente == null) {
            frente = nodoNuevo;
        } else {
            fin.setEnlace(nodoNuevo);
        }
        fin = nodoNuevo;
        return true;
    }

    public synchronized boolean sacar() {
        boolean exito = true;
        //elimina el primer elemento de la cola
        if (this.frente == null) //reporta error ya que la cola está vacía
        {
            exito = false;
        } else {
            this.frente = this.frente.getEnlace();
            if (this.frente == null) {
                this.fin = null;
            }
        }
        return exito;

    }

    public synchronized Object obtenerFrente() {
        return frente.getElemento();
    }

    public synchronized boolean esVacia() {
        return (frente == null);
    }

    public void vaciar() {
        this.frente = null;
        this.fin = null;
    }

    public Cola clone() {
        Cola clon = new Cola();
        Nodo nodoAuxiliar = frente;
        clon = cloneAux(nodoAuxiliar, clon);
        return clon;
    }

    private Cola cloneAux(Nodo nodAux, Cola colaClon) {
        if (nodAux != null) {
            colaClon.poner(nodAux.getElemento());
            cloneAux(nodAux.getEnlace(), colaClon);
        }
        return colaClon;
    }
}
