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
public class StringPermutation {

    public static boolean permutation(String str1, String str2) {
        String mstr1="";
        String mstr2="";
        if (str1.length()>str2.length()) {
            mstr2 = str1;
            mstr1 = str2;
        }else{
            mstr1 = str1;
            mstr2 = str2;
        }
        for (int i = 0; i < mstr2.length(); i++) {
            int occ1 = 0;
            int occ2 = 0;
            int redflag = 0;
            char temp = mstr2.charAt(i);
            //System.out.println("KAAJ hocche: "+str2.charAt(i));
            if (mstr1.contains(String.valueOf(mstr2.charAt(i)))) {
                System.out.println("STR1");
                for (int j = 0; j < mstr1.length(); j++) {
              
                    if (mstr1.charAt(j)==mstr2.charAt(i)) {
                        System.out.println(mstr1.charAt(j)+"=="+mstr2.charAt(i));
                        occ1++;
                    }
                }
                System.out.println("STR2");
                for (int j = 0; j < mstr2.length(); j++) {
                    
                    if (mstr2.charAt(j)==temp) {
                        System.out.println(mstr2.charAt(j)+"=="+temp);
                        occ2++;
                    }
                }
            }else{
                redflag++;
            }
            if (occ1!=occ2) {
                return false;
            }
            if (redflag>0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(permutation("CAT","ACT"));
    }
}
