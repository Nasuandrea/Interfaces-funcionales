package com.example.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Suplier proporciona un dato, no recibe nada, devuelve algo, le pasamos el tipo de dato que nos tiene que devolver
        //Al recibir 0 parametros en la lambda poner () -> ...
        Supplier<Double> generator = () -> Math.random();

        System.out.println("Número aleatorio: " + generator.get());

        Supplier<Double> generator2= () -> new Random().nextDouble(500+1);
    }
}
