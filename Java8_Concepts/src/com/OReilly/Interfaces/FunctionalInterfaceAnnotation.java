package com.OReilly.Interfaces;

/**
 * @author vidit.singh
 * @created 03/05/2022 - 19:46
 */
public class FunctionalInterfaceAnnotation {
    private void display(int num1, int num2,MathmeticalOperation mathmeticalOperation){
        System.out.println(mathmeticalOperation.calculate(num1,num2));
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation functionalInterfaceAnnotation = new FunctionalInterfaceAnnotation();
        MathmeticalOperation add = Integer::sum;
        functionalInterfaceAnnotation.display(5,4,add);

        functionalInterfaceAnnotation.display(5,4,(num1, num2) -> num1 - num2);
        functionalInterfaceAnnotation.display(5,4,(num1, num2) -> num1 * num2);
        functionalInterfaceAnnotation.display(5,4,Integer::divideUnsigned);

    }
}
