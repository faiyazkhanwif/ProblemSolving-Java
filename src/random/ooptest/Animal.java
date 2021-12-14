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
public class Animal {

    private String name;
    private int avglife;
    private int avgh;

    public String getName() {
        return name;
    }

    public int getAvglife() {
        return avglife;
    }

    public int getAvgh() {
        return avgh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvglife(int avglife) {
        this.avglife = avglife;
    }

    public void setAvgh(int avgh) {
        this.avgh = avgh;
    }
    public void dance(){
        System.out.println("someone dancing");
    }
    public void dance(String name){
        System.out.println(name+" dancing");
    }
}

