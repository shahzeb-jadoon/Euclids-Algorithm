public class GreatestCommonDivisor {

    public static int gcd(int largerNum, int smallerNum) {

        /**
         * This method uses Euclid's algorithm to calculate the Greatest Common Divisor
            of two non-negative integers
            
         * @param  largerNum & smallerNum are both non-negative integers, and largerNum > smallerNum
         * @return greatest common divisor of largerNum & smallerNum
         */

        while (smallerNum != 0) {
            int remainder = largerNum % smallerNum;
            largerNum = smallerNum;
            smallerNum = remainder;
        }

        return largerNum;
    }
    
    public static void main(String [] args) {
        int largerNum = 60;
        int smallerNum = 24;

        System.out.println(gcd(largerNum, smallerNum));
    }
}
