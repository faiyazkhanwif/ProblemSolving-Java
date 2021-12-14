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
public class Dog extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void print(){
        System.out.println(super.getName());
        System.out.println(super.getAvgh());
        System.out.println(super.getAvglife());
        System.out.println(color);
    }

    @Override
    public void dance(String name) {
        System.out.println(name+ "in my room dancing");
    }
    
}
