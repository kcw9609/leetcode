class Solution {
    public int[] sortedSquares(int[] nums) {
        // 제곱으로 변환

        for(int i = 0 ; i < nums.length ; i ++) {
            nums[i] = nums[i] * nums[i];
        }


        // 정렬
        Arrays.sort(nums);

        return nums;
        
    }
}