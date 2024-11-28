class Solution {
    public int majorityElement(int[] nums) {
        // 선언
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = nums[0]; // 최대로 나온 key
        // hashset에 넣음
        for(int i = 0 ; i < nums.length ; i ++ ) {
            int it = nums[i];
            
            map.put(it, map.getOrDefault(it, 0) + 1 );
            if(map.get(it) > map.get(max)) {
                max = it;
            }

        }
        return max;
        
    }
}