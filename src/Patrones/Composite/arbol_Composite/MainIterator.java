package Patrones.Composite.arbol_Composite;


import java.util.Iterator;

import Patrones.Iterator.EjemploGeneral.Nodo;
import upm.jbb.IO;

public class MainIterator {
    private Nodo raiz = null, actual = null;

    public void addNodo() {
        Nodo aux = new Nodo(IO.in.readInt("Valor del nodo"));
        if (this.raiz == null) {
            this.raiz = aux;
        } else {
            this.actual.insertar(aux);
        }
        this.actual = aux;
    }

    public void view() {
        if (this.raiz == null) {
            IO.out.println("null");
            return;
        }
        Iterator<Integer> i = this.raiz.iterator();
        while (i.hasNext()) {
            IO.out.print(i.next()+ ", ");
        }
        IO.out.println();

    }

    public static void main(String[] args) {
        IO.in.addController(new MainIterator());
    }

}