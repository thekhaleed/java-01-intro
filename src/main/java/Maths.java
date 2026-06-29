/**
 * This is my impression of how the math class is implemented in Java
 * @version 1.0 2026-June-29
 * @author thekhaleed
 */

public class Maths {
    public static void main(String[]args){
//      System.out.println(Maths.division(2,4));
        System.out.println(Maths.modulus(2,4));

//      Here we are first creating an instance of the Maths object so we can access its instance method
        Maths mars = new Maths();
        System.out.println(mars.division(3,6));
        System.out.println(mars.modulus(3,6)); //This works but yiu see it brings a warning because this ia a static class

    }

//  This is an instance method. Meaning, we would have to first create an object instance of the Maths class tp access this method
    public double division(double a, double b){
        return a/b;
    };

//  This is a static method; meaning it belongs to the Maths class and we dont have to create an instance of the class object to access this. We can just do Maths.modulus
    public static int modulus(int a, int b){
        return a%b;
    }
}


