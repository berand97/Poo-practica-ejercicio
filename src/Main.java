import unac.edu.co.Lista;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Random n;
        int e;
        Lista lista;
        int p;
        final int Maximo = 999;
        n = new Random(1);
        lista = new Lista(); // crea lista vac�a
        p = 30;// Math.abs(r.nextInt() % 55); // n�mero de nodos
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Lista ordenada.");
            for (; p > 0; p--) {
                e = n.nextInt(Maximo) + 1;
                lista.insertar(e);
            }
        lista.visualizar();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Lista eliminada.");
        lista.eliminar(979);
        lista.visualizar();
    }
}

