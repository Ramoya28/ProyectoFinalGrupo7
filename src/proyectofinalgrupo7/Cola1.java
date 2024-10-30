package proyectofinalgrupo7;

public class Cola1 {
    
    private Nodo1 prim, ult;
    private int cant = 0;

    public boolean esVacia() {
        if (prim == null) {
            return true;
        } else {
            return false;
        }
    }

    public int encola(Tiquete pTiquete) {
        Nodo1 nuevo = new Nodo1(pTiquete);

        if (this.esVacia()) {
            prim = ult = nuevo;
        } else {
            ult.setSig(nuevo);
            ult = nuevo;
        }
        cant += 1;
        return 1;
    }

    public int atiende() {
        if (!this.esVacia()) {
            if (prim == ult) {
                prim = ult = null;
            } else {
                prim = prim.getSig();
            }
            cant -= 1;
            return 1;
        } else {
            return -1;//cola es vacia
        }
    }

    public boolean encontrar(int n) {
        if (this.esVacia()) {
            return false;
        } else {
            Nodo1 aux = prim;
            while (aux != null) {
                if (n == aux.getNumTiquete().getId()) {
                    return true;
                }
                aux = aux.getSig();
            }

            return false;
        }

    }

    public int eliminar(int n) {
        if (this.esVacia()) {
            return -1;//informar que la pila es vacia
        } else {
            if (prim.getNumTiquete().getId() == n) {
                if (prim == ult) {
                    prim = ult = null;
                } else {
                    prim = prim.getSig();
                }
                return 1;
            } else {
                Nodo1 aux = prim;
                while (aux.getSig() != null) {
                    if (aux.getSig().getNumTiquete().getId() == n) {
                        aux.setSig(aux.getSig().getSig());
                        return 1;
                    }
                    aux = aux.getSig();
                }
            }
            return -2;//no se encontro el elemento a eliminar
        }
    }

    public Tiquete extrae(int n) {
        if (this.esVacia()) {
            return null;
        } else {
            Tiquete extraido;
            if (prim.getNumTiquete().getId() == n) {
                extraido=prim.getNumTiquete();
                if (prim == ult) {
                    prim = ult = null;
                } else {
                    prim = prim.getSig();
                }
                return extraido;
            } else {
                Nodo1 aux = prim;
                while (aux.getSig() != null) {
                    if (aux.getSig().getNumTiquete().getId() == n) {
                        extraido = aux.getSig().getNumTiquete();
                        aux.setSig(aux.getSig().getSig());
                        return extraido;
                    }
                    aux = aux.getSig();
                }
                return null;
            }
            
        }
    }

    @Override
    public String toString() {
        Nodo1 aux = prim;
        String r = "COLA\nCantidad de elementos: " + cant + "\n";
        if (!this.esVacia()) {
            while (aux != null) {
                r += aux + "\n";
                aux = aux.getSig();
            }
        } else {
            r += "vacia";
        }
        return r;
    }
    
}
