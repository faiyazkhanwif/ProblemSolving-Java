/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

/**
 *
 * @author faiya
 */
class Printer<T>
{
   T[] ob;

   void printArray(T[]ob){
       for (int i = 0; i < ob.length; i++) {
           System.out.println(ob[i]);
       }
   }

    
}
public class JavaGenerics {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}
