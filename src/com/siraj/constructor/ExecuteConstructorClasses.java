package com.siraj.constructor;

public class ExecuteConstructorClasses {
    public static void main(String[] args) throws InterruptedException {
        ExecuteConstructorClasses ExecuteConstructorClasses = new ExecuteConstructorClasses();
        ExecuteConstructorClasses.testConstructors();
    }

    private void testConstructors() throws InterruptedException {
        System.out.println("If class has no constructor, JVM provides default constructor \n");

        ClassWithNoDefaultConstructor classWithNoDefaultConstructor = new ClassWithNoDefaultConstructor();

        ClassWithDefaultConstructor classWithDefaultConstructor = new ClassWithDefaultConstructor();

        ClassWithParameterizedConstructor classWithParameterizedConstructor = new ClassWithParameterizedConstructor(10);

        System.err.println("\nIf class has parameterized constructor,  we may not be able to create instance with default constructor \n" +
                "ClassWithParameterizedConstructor classWithParameterizedConstructor1 = new ClassWithParameterizedConstructor() \n" +
                "until we explicitly create no arg constructor. Else we receive below Error. \n" +
                "'ClassWithParameterizedConstructor(int)' in 'com.siraj.constructor.ClassWithParameterizedConstructor' cannot be applied to '()'");

        ClassWithParameterizedAndExplicitDefaultConstructor classWithParameterizedAndExplicitDefaultConstructor = new ClassWithParameterizedAndExplicitDefaultConstructor();

        System.err.println("\nIf no instance for a class to be created define constructor as private \n" +
                "ClassWithPrivateConstructors classWithPrivateConstructors = new ClassWithPrivateConstructors(), \n" +
                "we may not be able to create instance with default constructor we receive below Error. \n" +
                "'ClassWithPrivateConstructors()' has private access in 'com.siraj.constructor.ClassWithPrivateConstructors' \n" +
                "but can access static fields or methods directly as " +
                "ClassWithPrivateConstructors.CONSTANT_VALUE = " + ClassWithPrivateConstructors.CONSTANT_VALUE);

        ;
    }
}
