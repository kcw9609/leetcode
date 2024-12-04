class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] list1 = s.toCharArray();
        char[] list2 = t.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        // stack에 넣기

        for(int i = 0 ; i < list1.length ; i ++) {
            if(list1[i] == '#' && stack1.isEmpty() == false) stack1.pop();
            else if(list1[i] == '#' && stack1.isEmpty() == true){}
            else {
                stack1.push(list1[i]);
            }
            
        }
        for(int i = 0 ; i < list2.length ; i ++) {
            if(list2[i] == '#' && stack2.isEmpty() == false) stack2.pop();
            else if(list2[i] == '#' && stack2.isEmpty() == true){}
            else {
                stack2.push(list2[i]);
            }
            
        }
        // 하나씩 꺼내서 #, #앞 지우기
        if(stack1.size() != stack2.size()) return false;


        // 비교하기
         while (!stack1.isEmpty()) {
            if(stack1.pop() != stack2.pop()) return false;
        }
        return true;
        
    }
}