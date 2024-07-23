package easy;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = { 11, 2, 15, 7 };
        int target = 9;

        System.out.println(Arrays.toString(twoSum( nums, target ) ));


    }

    private static int[] twoSum( int[] nums, int target ) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int []{i, j};
                }

                if (nums[nums.length - j] + nums[nums.length - j - 1] == target) {
                    return new int []{ nums.length - j, nums.length - j - 1 };
                }
            }
        }

        return new int []{ 0, 0 };
    }
}
