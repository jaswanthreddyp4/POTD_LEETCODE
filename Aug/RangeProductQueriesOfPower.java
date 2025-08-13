// package Aug;
import java.util.ArrayList;
import java.util.List;

public class RangeProductQueriesOfPower {
    private long power(long base, long exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }

    public int[] productQueries(int n, int[][] queries) {
        int modulo = 1_000_000_007;

        List<Integer> exponents = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                exponents.add(i); 
            }
        }

        int size = exponents.size();
        long[] prefixSum = new long[size + 1];
        for (int i = 0; i < size; i++) {
            prefixSum[i + 1] = prefixSum[i] + exponents.get(i);
        }


        int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            long totalExponent = prefixSum[right + 1] - prefixSum[left];

            answers[i] = (int)power(2, totalExponent,modulo);
        }

        return answers;
    }
}