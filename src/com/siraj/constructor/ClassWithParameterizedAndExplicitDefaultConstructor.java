package com.siraj.constructor;

public class ClassWithParameterizedAndExplicitDefaultConstructor {
    private int age;

    ClassWithParameterizedAndExplicitDefaultConstructor() {
        System.out.println("\nExecuted explicitly created default constructor from " + ClassWithParameterizedAndExplicitDefaultConstructor.class.getName());
    }

    ClassWithParameterizedAndExplicitDefaultConstructor(int age) {
        //Variable 'age' is assigned to itself
        //age=age;

        this.age = age;
        System.out.println("\nExecuted parameterized constructor with parameter value " + age + " from " + ClassWithParameterizedAndExplicitDefaultConstructor.class.getName());
    }
}
