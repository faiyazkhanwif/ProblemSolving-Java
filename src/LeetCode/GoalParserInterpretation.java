/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author faiya
 */
public class GoalParserInterpretation {

    public static String interpret(String command) {
        String res = "";
        res = command.replace("()", "o");
        res = res.replace("(al)", "al");
        return res;
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
}
