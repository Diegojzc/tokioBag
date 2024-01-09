package com.tokio.ejercicio_bag.bag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag {
    List<Object> bag = new ArrayList<>();

    Random generador = new Random();

    // Metodo para añadir cosas en la bolsa
        public boolean add (Object e){
            bag.add(e);
            return true;
        }

        //Elimina todos los elementos de la bolsa
        public boolean clear () {
            bag.clear();
            return true;
        }

        // Comprueba si un objeto determinado está en la bolsa
        public boolean contains (Object o){
            return bag.contains(o);
        }


        // Indica si la bolsa está vacía o no
        public boolean isEmpty () {
            return bag.isEmpty();
        }

        // Devuelve el número de elementos de la bolsa
        public int size () {
            return bag.size();
        }
        //extraer objetos de la bolsa
        public Object extract () {
            int i = generador.nextInt(bag.size());

            return bag.get(i);
        }

    @Override
    public String toString() {
        return bag.toString();
    }

    public static void main (String[]args){
            Bag bag = new Bag();

            bag.add("libros");
            bag.add("lapiz");
            bag.add("boli");


            System.out.println(bag);
            System.out.println(bag.contains("libros"));
            System.out.println(bag.extract());
            System.out.println(bag.size());

        System.out.println(bag.clear());
        System.out.println(bag.isEmpty());
        }

}
