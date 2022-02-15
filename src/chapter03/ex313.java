package chapter03;

import static java.lang.Math.random;

public class ex313 {
    public static void main(String[] args) {
        int arraySize = 15;
        int arrayBuffer;
        int[] nums = new int[arraySize];
        System.out.println("Исходный массив:");
        for(int k = 0; k < arraySize; k++) {
            nums[k] = (int) (5 * arraySize * random());
            System.out.print(nums[k] + " ");
        }

        for(int m = 1; m < nums.length; m++) {
            for(int k = 0; k < nums.length - m; k++) {
                if(nums[k] > nums[k + 1]) {
                    arrayBuffer = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = arrayBuffer;
                }
            }
        }
        System.out.println("\nМассив после сортировки:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
