/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.ooptest;

/**
 *
 * @author faiya
 */
public class Test {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("meo");
        cat.setAvgh(20);
        cat.setAvglife(2);
        System.out.println(cat.getName());
        cat.dance(cat.getName());
        System.out.println("------------");
        
        Dog dog = new Dog();
        dog.setName("jacky");
        dog.setAvgh(25);
        dog.setAvglife(2);
        dog.setColor("pink");
        dog.print();
        
        dog.dance();
        dog.dance(dog.getName());
    }
}
