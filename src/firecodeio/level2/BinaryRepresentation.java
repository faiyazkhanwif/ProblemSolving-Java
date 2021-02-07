/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firecodeio.level2;

/**
 *
 * @author faiya
 */
//Interview Question from Oracle
public class BinaryRepresentation {

    public static String computeBinary(int val) {
        if (val == 0) {
            return "0";
        }
        int temp = val;
        String binres = "";
        while(temp!=0){
            int bindigit = temp%2;
            binres+=bindigit;
            temp = temp/2;
        }
        String finalres = "";
        for (int i = binres.length()-1; i >= 0; i--) {
            finalres+=String.valueOf(binres.charAt(i));
        }
        return finalres;
    }
    public static void main(String[] args) {
        System.out.println(computeBinary(5));
    }
}
