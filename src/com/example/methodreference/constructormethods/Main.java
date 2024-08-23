package com.example.methodreference.constructormethods;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //0 argumentos  : podemos usar lambdas o metodos referencia
        Supplier<Employee> employeeSupplier = () -> new Employee();

        Supplier<Employee> employeeSupplier1 = Employee::new;

        //1 argumento: solo usar lambdas con Supplier o crear una interfaz funcional que reciba argumentos

        Supplier<Employee> employeeSupplier2 = () -> new Employee("Juan");

        EmployeeWithName employee = name -> new Employee(name);
        EmployeeWithName employee1 = Employee::new;
        System.out.println(employee1.create("Pedro").toString());

        //2 argumentos, usamos Bifucntion que tiene dos parametros de entrada y uno de salida

        BiFunction<String, Integer, Employee> employee2 = Employee::new;
        System.out.println(employee2.apply("Jose", 35).toString());
    }
}
