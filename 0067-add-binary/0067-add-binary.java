class Solution {
    public String addBinary(String a, String b) {
        /*
        
        // 선언
        {
// First, create result name string and intially it is empty & in the end we gonna return it as our aswer
        StringBuilder res = new StringBuilder(); 
        int i = a.length() - 1; // we crete i pointer for string a and we have to start adding from right to left 
        int j = b.length() - 1; // similar pointer j for string b
        int carry = 0; // we create a carry, as we have to consider it as well

        // 더함
        sum = String.valueOf(ai + bi);
        int index = sum.indexOf(target);
        if (index != -1) {
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(index, '1'); // 해당 위치의 값을 수정
            sb.setCharAt(index -1, )
            str = sb.toString(); // 수정된 문자열로 업데이트
        }

        // 더한 값 자리에 2가 있으면 앞으로 더해줌 <- 반복
        
    }
    
    
    // 선언
    int ai = Integer.parseInt(a);
    int bi = Integer.parseInt(b);

    String binary = Integer.toBinaryString(ai + bi); // "10010"

    return binary;
    }
    */


 StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }


}