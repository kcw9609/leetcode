class Solution {
    public boolean canJump(int[] nums) {
        // set
        int goal = nums.length - 1;
        // jump 1 step
        // range

        for ( int i = nums.length - 2; i >= 0 ; i--) {
            if(i + nums[i] >= goal) {
                goal = i;
                
            }

        }
        return goal == 0 ? true : false;
    }
}