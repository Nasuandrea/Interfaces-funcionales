package com.example.methodreference.instancemethods;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Metodos instancia: cuando hay un objeto en vez de un método static - ya no es estatico el metodo de la clase,
        //Accedemos a un método de un objeto no de una clase
        PositiveNumber positiveNumber = new PositiveNumber();

        Predicate<Integer> predicate = num -> positiveNumber.isPositive(num);

        Predicate<Integer> predicate1 = positiveNumber::isPositive;
    }
}
class PositiveNumber{
    public boolean isPositive(int num){
        return num >= 0 ;
    }
}
