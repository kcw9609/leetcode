class Solution {
    public int[] countBits(int n) {
        /**
        0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
6 --> 110
7 --> 111 
8 --> 1000
        
         */ 

         int[] ans = new int[n + 1];
         ans[0] = 0;

         for(int i = 1 ; i <= n ; i ++) {
            // << x : x만틈 나눔
            /**
            2로 나눠서 이전에 사용한 수를 재활용
            ex) 1000(8)의 경우 -> 100(<<1한 값) = 1 (100 일 때, 계산한 1의 수 다시 사용) 
            && 아까 <<1했던 비트만 추가로 계산
             */
            ans[i] = ans[i>>1] + (i & 1);
         }
         return ans;
        
    }
}