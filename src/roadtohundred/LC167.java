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
public class LC167 {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] arr = new int[2];
        while (left < right) {
            int temp = numbers[left] + numbers[right];
            //System.out.println(temp + ";;");
            if (temp > target) {
                right--;
            } else if (temp < target) {
                left++;
            } else {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
