class Solution {
    public String longestCommonPrefix(String[] strs) {
        // set
        String prefix = strs[0];
        if( strs.length == 1) return prefix;


        // 첫 문자열을 기본으로
        for(int i = 1 ; i < strs.length ; i ++) {
            // 다음 문자열과 비교해서 다른 부분 제거
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        // 남는 문자 리턴
        return prefix;
  
    }
}