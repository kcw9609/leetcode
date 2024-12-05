class Solution {
    public int singleNumber(int[] nums) {
        // 선언
        int ans = 0; // xor 시 자기자신을 얻음

        for(int i = 0; i < nums.length ; i ++) {
            ans = ans^nums[i]; // a^a^b = b 성질을 이용. 마지막에 나오는 값이 1번 나온 값. 비트 연산 중 
        }
        return ans;
        
    }
}