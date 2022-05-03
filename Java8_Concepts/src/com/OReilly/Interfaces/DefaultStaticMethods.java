package com.OReilly.Interfaces;

import java.util.function.Consumer;

/**
 * @author vidit.singh
 * @created 03/05/2022 - 20:13
 */
public class DefaultStaticMethods implements DefaultDemo{
    @Override
    public void show() {
        System.out.println("Overriding show()");
    }

    public void defaultMethod(){
        System.out.println("Providing own implementation");
        DefaultDemo.staticMethod();
    }


    public static void main(String[] args) {
        DefaultStaticMethods defaultStaticMethods = new DefaultStaticMethods();
        defaultStaticMethods.show();
        defaultStaticMethods.defaultMethod();
    }
}

@FunctionalInterface
interface DefaultDemo{

    void show();

    default void defaultMethod(){
        System.out.println("Default method implementation of DefaultDemo interface!");
    }
    static void staticMethod(){
        System.out.println(" Static Implementation of the DefaultDemo interface!");
    }
}
