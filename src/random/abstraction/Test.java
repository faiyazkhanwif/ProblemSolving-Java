/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.abstraction;

/**
 *
 * @author faiya
 */
public class Test {

    public static void main(String[] args) {
        Duck dc = new AsianDuck();
        dc.setName("mduck");
        dc.fly(dc.getName());
    }
}
