class Solution {
    public boolean isPalindrome(int x) {

        char[] list = (String.valueOf(x)).toCharArray();
        // 예외처리

        if(x < 0 )return false;

        
        for(int i = 0 ; i < list.length/2 ; i ++) {

            if( list[i] != list[list.length - i -1]) return false;
            
        }
        return true;

        
    }
}