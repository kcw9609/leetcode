class Solution {
    public int longestPalindrome(String s) {
        // map에 저장

         Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int isAddedOdd  = 0;
        int length = 0;

        // 짝수 개수는 +
         for (int count : map.values()) {
            // 짝수는 모두 추가
            if (count % 2 == 0) {
                length += count;
            } else {
                // 홀수는 (n-1)만큼 추가하고, 하나는 중앙에 위치
                length += count - 1;
                isAddedOdd = 1;
            }
        }

        length += isAddedOdd;
        return length;
            

        // 홀수 개수는 n-1씩 + 마지막 하나만 선택
        
    }
}