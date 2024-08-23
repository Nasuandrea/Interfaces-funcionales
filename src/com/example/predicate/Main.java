package com.example.predicate;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Predicate devuelve un booleano - Sirve para hacer filtros, si se cumple o no esa condición
        Predicate<String> validateLength = name -> name.length() > 5 && name.length() < 15;

        System.out.println("Probando si se cumple condicion del predicate: ");
        System.out.println(validateLength.test("Andrea"));
        System.out.println();

        System.out.println("Nombres que cumplen condicion del predicate: ");
        List<String> names = List.of("Andrea", "Patricia", "Eva");
        for (String name : names) {
            if(validateLength.test(name))
                System.out.println(name);
        }
        System.out.println();

        System.out.println("Nombres que cumplen condicion del predicate: ");
        names.stream()
                .filter(validateLength)
                .forEach(name-> System.out.println(name));
        System.out.println();

        //version funcional sin usar predicate
        System.out.println("Nombres que cumplen condicion < 5: ");
        names.stream()
                .filter(name -> name.length() < 5)
                .forEach(name-> System.out.println(name));
    }

}
