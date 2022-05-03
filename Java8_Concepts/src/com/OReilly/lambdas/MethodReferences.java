package com.OReilly.lambdas;

/**
 * @author vidit.singh
 * @created 03/05/2022 - 14:03
 */
public class MethodReferences {

    public static boolean isClassic(int movieId){
        return true;
    }
    public void testStaticMethodReferences(){
        Imovie imovie = movieId -> movieId < 100; // Using lambda expressions
        System.out.println("Checking lambda expression output ::" +  imovie.check(100));

        Imovie imovie1 = MethodReferences::isClassic; // Using Static Method References
        System.out.println("Checking static method reference output ::" + imovie1.check(2));
    }

    public void testInstanceMethodReference(){
        MethodReferences methodReferences = new MethodReferences();
        Imovie im = methodReferences::isTop10;
        System.out.println("Checking instance method reference output :: " + im.check(1000));
    }

    public boolean isTop10(int movieId){
        return movieId > 0 && movieId < 11;
    }

    public static void main(String[] args) {
       new MethodReferences().testStaticMethodReferences();
       new MethodReferences().testInstanceMethodReference();
    }


}
interface Imovie{
    boolean check(int movieId);
}