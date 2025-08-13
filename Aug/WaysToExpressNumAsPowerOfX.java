// package Aug;

//     //we need to find number of ways of expressing n as sum of powers of distinct natural numbers
//     //for this we need set of values upto which we need to iterate and find
//     //min value can be 1 , max value can be xth root of n
import java.util.Arrays;

class WaysToExpressNumAsPowerOfX {
    int infinity = (int) 1e9 + 7;


    public int xthRootOfN(int n, int x) {
        int left = 1;
        int right = n;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long power = 1;
            for(int i = 0; i < x; ++i) {
                power *= mid;
                if (power > n) break;
            }

            if (power <= n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public int numberOfWays(int n, int x) {
        int maxi = xthRootOfN(n, x);
        int[][] memo = new int[maxi + 1][n + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return f(1, 0, n, x, maxi, memo);
    }


    public int f(int index, int val, int num, int x, int maxNum, int[][] memo) {
        if (val == num) {
            return 1;
        }

        if (index > maxNum || val > num) {
            return 0;
        }


        if (memo[index][val] != -1) {
            return memo[index][val];
        }

        int powerOfIndex = (int) Math.pow(index, x);

        int pick = 0;
        if (val + powerOfIndex <= num) {
            pick = f(index + 1, val + powerOfIndex, num, x, maxNum, memo);
        }

        int notPick = f(index + 1, val, num, x, maxNum, memo);
        return memo[index][val] = (pick + notPick) % infinity;
    }
}