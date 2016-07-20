package com.makarand.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gen<T> {

    private T contents;

    public static String[] strings[];

    // private static T vars []; // doesn't work?

    public Gen() {

    }

    public T getContents() {

        return contents;
    }

    public void setContents(T contents) {

        this.contents = contents;

        if (this.contents instanceof List<?>) {

        }
        /*
         * if(this.contents instanceof Gen<T>){ doesn't work ? }
         */
    }

    public static void main(String[] args) {


        Gen<String[]> gens = new Gen<>();

        gens.setContents("Makarand".split("a"));

        System.out.println(Arrays.toString(gens.getContents()));
    }


    public void testWildCard() {

        List<? extends Exception> l1 = new ArrayList<Exception>();
        List<? extends Exception> l2 = new ArrayList<RuntimeException>();

        l1.forEach(e -> System.out.println(e.getMessage()));
        l2.add(null);
        // l1.add(new Exception());

        // l1.add(new Throwable());

        List<? super Exception> l3 = new ArrayList<Exception>();
        List<? super Exception> l4 = new ArrayList<Throwable>();

        List<?> l5 = new ArrayList<Gen<String>>();

        l5.add(null);
        l4.add(new Exception());
        l3.add(new RuntimeException());

        // l3.add(new Throwable());

        System.out.println(l1 + "" + l2 + l3 + l4 + l5);

        printList(l4);

    }


    public void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    <E> E method1(List<? extends E> list, int index) {

        return list.get(index);
    }
    
    
}
