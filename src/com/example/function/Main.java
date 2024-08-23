package com.example.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Function se utiliza para transformar o extraer datos: ej: pasamos un nombre y te devuelve la longitud de ese nombre. Metes texto sale un número
        //Primer parametro: lo que pasamos, segundo: lo que devuelve
        Function<String,Integer> extractLength = message -> message.length();
        System.out.println("Longitud del texto: " + extractLength.apply("Andrea"));
        System.out.println();

        //BiFunction pasa dos parametros de entrada, uno de salida
        //Cuando hay 0 o 2 parametros de entrada hay que poner paréntesis en la lambda, ej: (num1,num2) -> ...
        BiFunction<Double, Double, Double>  divider = (num1,num2) -> num1/num2;
        System.out.println("Resultado dividir: "+ divider.apply(6.0,3.0));
    }
}
