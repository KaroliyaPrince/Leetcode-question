class Solution {
    public int divide(int dividend, int divisor) {

        int sign = 1;

        if ((dividend < 0 && divisor > 0) ||
            (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        long quo = 0;

        while (dividendLong >= divisorLong) {

            long temp = divisorLong;
            long multiple = 1;

            while (dividendLong >= temp + temp) {
                temp = temp + temp;
                multiple = multiple + multiple;
            }

            dividendLong -= temp;
            quo += multiple;
        }

        if (sign == -1) {
            quo = -quo;
        }

        if (quo > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quo < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quo;
    }
}