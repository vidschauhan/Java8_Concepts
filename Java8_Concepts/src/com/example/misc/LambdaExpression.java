package com.example.misc;

interface Drawable{  
    public void draw(int a);  
}
/**
 * @author Vidit 
   25-Dec-2017 6:57:31 PM
 */
public class LambdaExpression {

	public static void main(String[] args) {
		

	   int width=10;  
	   
       //without lambda, Drawable implementation using anonymous class  
       /*Drawable d=(n)->System.out.println("Drawing "+n); 
       d.draw(width);  */
       
      
       
       
       ABC abc = new ABC();
       abc.view(x-> x+2);
      // System.out.println(val.show(10));
   }  
    
}

class ABC {
	
	public void view(xyz xyz) {
		System.out.println("Addition is :" + xyz.show(110));
	}
}

interface xyz {
	public int show(int a);
}

  