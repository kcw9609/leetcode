class MyQueue {
    private Stack<Integer> stack1; // 요소를 추가하는 스택
    private Stack<Integer> stack2; // 요소를 제거하는 스택

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

        
    }
    
    public void push(int x) {
        // s2로 옮기기
        // s1에 추가 후
        // s1 <- s2
        while(!stack1.empty()){
           stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.empty()){
           stack1.push(stack2.pop());
        }

    }
    
    public int pop() {
        return stack1.pop();
        
    }
    
    public int peek() {
        return stack1.peek();
        
    }
    
    public boolean empty() {
        return stack1.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */