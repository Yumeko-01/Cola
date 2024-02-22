/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import java.util.Iterator;

/**
 *
 * @author medin
 */
public class Queue<T> implements Iterable<T> {

    //Constantes
    public static final int MAX = 10;
    //Atributos
    private T[] ts;
    private int actual;

    //Constructor
    public Queue() {
        ts = (T[]) new Object[MAX];
        actual = 0;
    }

    public Queue(int tamano) {
        ts = (T[]) new Object[tamano];
        actual = 0;
    }

    public void enQueue(T t) {
        if (actual > ts.length) {
            System.out.println("La cola esta llena");
        } else {
            ts[actual] = t;
            actual++;
        }
    }

    public void deQueue(T t) {
        
    }

    public boolean isEmpty() {
        return actual == 0;
    }

    public int size() {
        return actual;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>();
    }

    private class ArrayIterator<T> implements Iterator<T> {

        //Constatne
        //public static final int MAX = 10;
        private int posicion = 0;

        @Override
        public boolean hasNext() {
            return actual < ts.length;
        }

        @Override
        public T next() {
            if (posicion < ts.length) {
                T t = (T) ts[posicion];
                posicion++;
                return t;
            } else {
                System.out.println("No existen mas elementos");
                return null;
            }

        }

    }
}
