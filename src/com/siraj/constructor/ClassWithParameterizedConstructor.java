package com.siraj.constructor;

public class ClassWithParameterizedConstructor {
    private int age;

//    ClassWithParameterizedConstructor() {
//        System.out.println("executed default constructor from " + ClassWithParameterizedConstructor.class.getName());
//    }

    ClassWithParameterizedConstructor(int age) {
        //Variable 'age' is assigned to itself
        //age=age;

        this.age = age;
        System.out.println("\nExecuted parameterized constructor with parameter value " + age + " from " + ClassWithParameterizedConstructor.class.getName());
    }
}
