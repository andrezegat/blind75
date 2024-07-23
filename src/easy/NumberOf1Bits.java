package easy;

public class NumberOf1Bits {

    public static void main(String[] args) {

        int x = 2147483645;
        System.out.println(hammingWeight(x));
    }

    public static int hammingWeight( int n ) {

        if (n == 0)
            return 0;

        int total = 0;

        while ( n > 0) {

            if ((n % 2) == 1)
                total++;

            n = n/2;
        }
        return total;
    }

}
