/** 
class Solution {
    public int climbStairs(int n) {
        // 초기화
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;


// 범위 처리
        if(n == 0 || n== 1 ) return 1;

        // 다이나믹
        for(int i = 2 ; i <= n ; i ++) {
            //  ex n=3, 2층까지 올라가는 수 + 1층 올라가는 수
            dp[i] = dp[i -1] + dp[i - 2];
            
        }
        return dp[n];

}
*/
class Solution {
    public int climbStairs(int n) {
        // 초기화
        int prev1=1, prev2 = 1;
        int current = 0;


// 범위 처리
        if(n == 0 || n== 1 ) return 1;

        // 다이나믹
        for(int i = 2 ; i <= n ; i ++) {
            //  ex n=3, 2층까지 올라가는 수 + 1층 올라가는 수
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
            
        }
        return prev1;
     
    }
}