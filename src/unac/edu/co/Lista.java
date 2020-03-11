package unac.edu.co;

public class Lista {
    protected Nodo primero;
    protected Nodo ultimo;
    public Lista() {
        primero = null;
        ultimo = null;
    }
    public Lista insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }
    public Lista insertarUltimo(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (ultimo != null) {
            ultimo.enlace = nuevo;
        } else {
            ultimo = nuevo;
        }
        if (primero == null) {
            primero = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    public Lista insertar(int entrada) {
        Nodo n = primero;
        Nodo anterior = null;
        boolean encontrado = false;
        while (n != null) {
            int valor = n.getDato();
            if (valor < entrada) {
                anterior = n;
                n = n.enlace;
            } else {
                if (valor == entrada)
                    encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            Nodo nuevo = new Nodo(entrada);
            if (anterior != null) {
                nuevo.setEnlace(anterior.enlace);
                anterior.setEnlace(nuevo);
            } else {
                nuevo.setEnlace(primero);
                primero = nuevo;
            }
            if (primero == null)
                primero = nuevo;
        }
        return this;
    }

    public Lista eliminar(int entrada) {
        Nodo n = primero;
        Nodo anterior = null;
        while (n != null) {
            if (n.getDato() < entrada) {
                anterior = n;
                n = n.enlace;
            } else {
                break;
            }
        }
        if (n != null) {
            if (n.getDato() == entrada) { // eliminar
                if (anterior != null) { // intermedio
                    anterior.setEnlace(n.getEnlace());
                } else // se inserta al principio
                    primero = n.getEnlace();
            }
        }
        return this;
    }

}
