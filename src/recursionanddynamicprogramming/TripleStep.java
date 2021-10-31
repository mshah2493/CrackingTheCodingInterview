package recursionanddynamicprogramming;

public class TripleStep {
	public static int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i < n + 1; ++i) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
