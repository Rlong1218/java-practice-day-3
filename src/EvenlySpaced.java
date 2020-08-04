// Given three ints, a b c, one of them is small, one is medium and one is large.
// Return true if the three values are evenly spaced,
// so the difference between small and medium is the same as the difference between medium and large.

public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c){
        int[] sorted = new int[]{a,b,c};
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length-i-1; j++) {
                if (sorted[j] > sorted[j+1]){
                    int temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;
                }
            }
        }
        return (sorted[1] - sorted[0]) == (sorted[2] - sorted[1]);
    }
}
