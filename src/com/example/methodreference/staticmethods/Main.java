package com.example.methodreference.staticmethods;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //methods reference: abrevian lambdas que tienen un unico metodo
        Predicate<Integer> checkPositive = num -> PositiveNumber.isPositive(num);
        System.out.println("Comprobación número positivo con lambda: " + checkPositive.test(10));

        //Reemplazado por method reference "::" en este caso la clase PositiveNumber tiene un único metodo estatico isPositive
        Predicate<Integer> checkPositive1 = PositiveNumber::isPositive;
        System.out.println("Comprobación número positivo con método de referencia de clase externa: " + checkPositive1.test(10));

        Predicate<Integer> checkNegative = Main::isNegative;
        System.out.println("Comprobación número negativo con método de referencia de Main: " + checkNegative.test(10));

        BooleanCheck checkPositive2 = num -> num > 5;
        System.out.println("comprobacion con interfaz funcional creada de num positivo: "+ checkPositive2.check(10));

        BooleanCheck checkPositive3 = num -> PositiveNumber.isPositive(num);
        System.out.println("comprobacion con interfaz creada de num positivo + lambda: "+ checkPositive3.check(10));

        BooleanCheck checkPositive4 = PositiveNumber::isPositive;
        System.out.println("comprobacion con interfaz creada de num positivo + method reference: "+ checkPositive4.check(10));

    }
        public static boolean isNegative(int num){return num <= 0 ;}

    class PositiveNumber{
        public static boolean isPositive(int num){
            return num >= 0 ;
        }
    }

    @FunctionalInterface
    interface BooleanCheck {
        boolean check(int num);
    }
}
