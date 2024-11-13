class Solution {
    public int search(int[] nums, int target) {
        // 중간 인덱스 비교
        // 중간 인덱스보다 타겟이 작으면 왼쪽으로 이동
        // left 인덱스 수정, mid인덱스 수정
        
        int left = 0;
        int right = nums.length -1;
        int mid = left + (right - left) / 2;
        while(left <= right){
            if(target == nums[mid]) return mid;
            if(left == right && nums[left] == target) return left;
            if (target < nums[mid]) {
                right = mid -1;
                // mid = ( left + right )/ 2 + 1;
                 mid = left + (right - left) / 2;
            } else if (target > nums[mid]) {
                left = mid + 1;
                // mid = ( left + right )/ 2 + 1;
                 mid = left + (right - left) / 2;

            }
        }
        
            return -1;
        } 
        
    }