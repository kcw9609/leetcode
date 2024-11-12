import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        // 두 단어 정렬
        // 비교
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        
        int[] unicode_s = new int[chars.length];
        int[] unicode_t = new int[chart.length];
        
        // 각 char를 유니코드로 변환하여 배열에 저장
        for (int i = 0; i < chars.length; i++) {
            unicode_s[i] = (int) chars[i];
            unicode_t[i] = (int) chart[i];
        }
         Arrays.sort(unicode_s);
         Arrays.sort(unicode_t);
        
        boolean isEqual = Arrays.equals(unicode_s, unicode_t);
        
        return isEqual;
    }
}