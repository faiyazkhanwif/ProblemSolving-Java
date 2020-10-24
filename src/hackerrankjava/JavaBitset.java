/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class JavaBitset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int qurSize = scan.nextInt();
        
        BitSet bitSet1 = new BitSet(arrSize);
        BitSet bitSet2 = new BitSet(arrSize);
        
        for(int i=0; i<qurSize; i++) {
            
            String command = scan.next();
            int bitSet = scan.nextInt();
            int index = scan.nextInt();
            
            switch(command){
                case "AND":
                    if(bitSet == 1) bitSet1.and(bitSet2);
                    if(bitSet == 2) bitSet2.and(bitSet1);
                    break;
                case "OR":
                    if(bitSet == 1) bitSet1.or(bitSet2);
                    if(bitSet == 2) bitSet2.or(bitSet1);
                    break;
                case "XOR":
                    if(bitSet == 1) bitSet1.xor(bitSet2);
                    if(bitSet == 2) bitSet2.xor(bitSet1);
                    break;
                case "FLIP":
                    if(bitSet == 1) bitSet1.flip(index);
                    if(bitSet == 2) bitSet2.flip(index);
                    break;
                case "SET":
                    if(bitSet == 1) bitSet1.set(index);
                    if(bitSet == 2) bitSet2.set(index);
                    break;
            }
            System.out.printf("%d %d %n", bitSet1.cardinality(), bitSet2.cardinality());
        }
        scan.close();
    }
}
