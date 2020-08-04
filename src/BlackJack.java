// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
// Return 0 if they both go over.

public class BlackJack {
    public static int blackjack(int a, int b) {
        if (Math.max(a,b) <= 21) {
            return Math.max(a,b);
        }
        if (Math.min(a,b) > 21){
            return 0;
        }
        else return Math.min(a,b);
    }
}
