package com.example.consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("init");
        //Consumer: consume un dato: lo imprime, lo guarda en alguna bbdd,enviarlo a algún sitio..
        //Clases anónimas : implementar interface sin crear una nueva clase
        Consumer<String> printer = new Consumer<String>() {
            public void accept(String message) {
                System.out.println(message);
            }
        };

        printer.accept("Hola!");
        //Lambdas: proporcionas el cuerpo de un método directamente
        //Lambdas : permiten implementar metodos que estan en interfaces que tienen un solo método abstracto
        Consumer<String> printer1 = message -> System.out.println(message);
        Consumer<String> printer2 = message -> System.out.println(message);

        printer1.accept("Hola! Lambda");

        Consumer<String> printer12 =printer1.andThen(printer2);
        printer12.accept("Adios!");

        List<String> names = new ArrayList<>();

        names.add("name1");
        names.add("name2");
        names.add("name3");

        names.forEach(name -> System.out.println(name));
        /* Equivalencia en bucle for:
        for (String name : names) {
            System.out.println(name);
        }*/
    }
}
