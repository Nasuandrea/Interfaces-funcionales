package com.example.methodreference.instancemethods;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Metodos instancia: cuando hay un objeto en vez de un método static
        PositiveNumber positiveNumber = new PositiveNumber();

        Predicate<Integer> predicate = num -> PositiveNumber.isPositive(num);

        Predicate<Integer> predicate1 = PositiveNumber::isPositive;


    }


}
class PositiveNumber{
    public static boolean isPositive(int num){
        return num >= 0 ;
    }
}
