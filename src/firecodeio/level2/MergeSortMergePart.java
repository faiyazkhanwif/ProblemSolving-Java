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
//Interview Question from salesforce
public class MergeSortMergePart {

    public static int[] merge(int[] arrLeft, int[] arrRight) {
        int [] res = new int[arrLeft.length+arrRight.length];
        //System.out.println(res.length);
        int leftcount=0;
        int rightcount=0;
        for (int i = 0; i < res.length; i++) {
            //System.out.println("leftcount: "+leftcount +"Rightcount: "+rightcount);
            if (leftcount>arrLeft.length-1) {
                res[i] = arrRight[rightcount];
                //System.out.println(arrLeft[rightcount]);
                rightcount++;
                continue;
            }else if(rightcount>arrRight.length-1){
                res[i] = arrLeft[leftcount];
                //System.out.println(arrLeft[leftcount]);
                leftcount++;
                continue;
            }
            if (arrLeft[leftcount]<arrRight[rightcount]) {
                res[i] = arrLeft[leftcount];
                //System.out.println(arrLeft[leftcount]);
                leftcount++;
            }else if(arrLeft[leftcount]>arrRight[rightcount]){
                res[i] = arrRight[rightcount];
                //System.out.println(arrLeft[rightcount]);
                rightcount++;
            }else if(arrLeft[leftcount]==arrRight[rightcount]){
                res[i] = arrLeft[leftcount];
                //System.out.println(arrLeft[leftcount]);
                leftcount++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,8};
        int[] arr2 = {2,4,7,12,32};
        int[] res = merge(arr1,arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            System.out.print(" ");
        }
    }
}
