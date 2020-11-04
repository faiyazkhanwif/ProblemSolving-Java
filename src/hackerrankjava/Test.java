/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class Test {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("{");
        s.push("}");
        s.push("(");
        s.push(")");
        int f = s.search("}");
        System.out.println(f);
        s.indexOf("(");
        
        
        
    }

}
