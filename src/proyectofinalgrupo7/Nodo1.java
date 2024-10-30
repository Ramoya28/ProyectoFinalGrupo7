package proyectofinalgrupo7;

public class Nodo1 {
    
    private Tiquete NumTiquete;//El elemento que contiene la informacion en el nodo
    private Nodo1 sig;//Dir memoria donde se encuentra el siguiente nodo

    public Nodo1() {
    }
    
    public Nodo1(Tiquete NumTiquete) {
        this.NumTiquete = NumTiquete;
    }

    public Tiquete getNumTiquete() {
        return NumTiquete;
    }

    public void setNumTiquete(Tiquete numTiquete) {
        this.NumTiquete = numTiquete;
    }

    public Nodo1 getSig() {
        return sig;
    }

    public void setSig(Nodo1 sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo1{" + "numTiquete=" + NumTiquete + '}';
    }
    
}
