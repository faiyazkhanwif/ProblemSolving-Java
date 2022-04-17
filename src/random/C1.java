/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author faiya
 */
public class C1 {

    public String solution(int N) {
        String res = ""; 

        for (int i = 1; i <= N; i++) {
            if (i%2==0) {
                res+="+";
            }else{
                res+="-";
            }
        }
        
        return res;
    }
}
