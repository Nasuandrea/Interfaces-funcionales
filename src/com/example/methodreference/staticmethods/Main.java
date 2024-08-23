package com.example.methodreference.staticmethods;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //methods reference: abrevian lambdas que tienen un unico metodo
        Predicate<Integer> checkPositive = num -> PositiveNumber.isPositive(num);
        System.out.println("Comprobación número positivo con lambda: " + checkPositive.test(10));

        //Reemplazado por method reference "::" en este caso la clase PositiveNumber tiene un único metodo estatico isPositive
        Predicate<Integer> checkPositive1 = PositiveNumber::isPositive;
        System.out.println("Comprobación número positivo con método de referencia: " + checkPositive1.test(10));

    }

    class PositiveNumber{
        public static boolean isPositive(int num){
            return num > 0 ;
        }
    }
}
