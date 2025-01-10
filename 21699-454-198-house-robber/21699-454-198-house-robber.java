class Solution {
    public int rob(int[] nums) {
        // Dynamic Programming


        int max = 0;
        int curr = nums[0];
        int[] dp = new int[nums.length + 1];

        Arrays.fill(dp, -1);

        if (nums.length <= 1) return nums[0]; // Base case
        // i = 0
        dp[0] = nums[0];
        // i = 1
        dp[1] = Math.max( nums[1] , dp[0] );
        // i >= 2
        for (int i = 2; i < nums.length ; i++) {
            // dp[curr-2] 와 비교
            dp[i] = Math.max( dp[i - 2] + nums[i], dp[i-1] ); // 점화식

        }
        return dp[nums.length -1];
    }
 

    }