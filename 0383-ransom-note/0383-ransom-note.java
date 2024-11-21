import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

         HashMap<Character, Integer> map = new HashMap<>();
         
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i); // 현재 문자를 변수로 저장 (가독성 향상)
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                    map.put(c, 1);
    }
}

        for(int i = 0 ; i < ransomNote.length() ; i ++ ) {
            if(map.containsKey(ransomNote.charAt(i)) == false ||  map.get(ransomNote.charAt(i)) == 0 ){
                return false;
            } 
            map.put(ransomNote.charAt(i) , map.get(ransomNote.charAt(i)) - 1);
        
        }
        return true;
        
    }
}
