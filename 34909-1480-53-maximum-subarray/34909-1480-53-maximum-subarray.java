class Solution {
    public int maxSubArray(int[] nums) {

        // 선언
        int[] array = nums;
        int maxHere = array[0];
        int maxFar = array[0];

        for(int i = 1 ; i < array.length ; i ++ ) {
            // 새롭게 시작할지 or 합쳐서 이어서 갈지
            maxHere = Math.max(maxHere + array[i], array[i]);
            // 최댓값 비교하여 갱신 why? here은 현재, 다음것만 비교하므로, 나중에 값이 작아질수도 있음
            maxFar = Math.max(maxHere, maxFar);
            
            
        }
        return maxFar;
        
    }
   
}