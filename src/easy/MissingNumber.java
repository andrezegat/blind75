package easy;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = { 3, 0, 1 };

        System.out.println( missingNumber(nums) );
    }

    public static int missingNumber( int[] nums ) {

        int lastNumber = nums.length + 1;

        char[] a = new char[lastNumber];

        for (int i = 0; i < nums.length; i++) {

            a[nums[i]] = 'X';
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 'X')
                return  i;
        }
        return 0;
    }
}
