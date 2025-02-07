import java.util.Arrays;
class Solution {
    /** 
    public int missingNumber(int[] nums) {
        // 배열 정리 -> 없는거 찾기
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) { // 0부터 n까지의 숫자를 초기화
            map.put(i, false);
        }
        for (int num : nums) { // 입력된 숫자를 true로 설정
            map.put(num, true);
        }
        for(Map.Entry<Integer, Boolean> entry : map.entrySet()){
            if(entry.getValue() == false) return entry.getKey();
        }


        return -1;
        
    }

*/
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int[] v = new int[length + 1];

// 초기화
        Arrays.fill(v, -1);

        // v에 위치값넣기
        for(int i = 0 ; i < length ; i ++) {
            v[nums[i]] = nums[i];
        }

        // -1인 값 판별
        for(int i = 0 ; i <= length ; i ++) {
            if(v[i] == -1) return i;
        }
        return -1;


    }
}





















