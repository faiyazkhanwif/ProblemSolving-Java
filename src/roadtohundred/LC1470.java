/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtohundred;

/**
 *
 * @author faiya
 */
public class LC1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int ind = 0;
        int ind1 = 0;
        int ind2 = n;
        while(ind2<=(n*2-1)){
            
            if (ind1<=n-1) {
                res[ind] = nums[ind1];
                ind++;
                ind1++;
            }
            if (ind2<=(n*2)-1) {
                res[ind] = nums[ind2];
                ind++;
                ind2++;
            }
        }
        return res;
    }
}
