// Given 3 int values, a b c, return their sum. However,
// if one of the values is 13 then it does not count towards the sum and values to its right do not count.

public class LuckySum {
    public static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        } else return a + b + c;
    }
}
