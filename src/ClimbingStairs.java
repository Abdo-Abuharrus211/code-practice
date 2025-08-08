public class ClimbingStairs {

    public int counter(int n) {
        if (n == 1) return 1;

        if (n == 2) return 2;

        return counter(n - 2) + counter(n - 1);
    }

    public int climbStairs(int n) {
        int[] steps = new int[n + 1];

        // base cases to facilitate DP
        steps[0] = 1;
        steps[1] = 1;

        for (int i = 2; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}
