class MinStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minstack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if (minstack.isEmpty() || x <= minstack.peek()) {
            minstack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
           int pop = stack.pop();
           if( pop==(minstack.peek())) {
               minstack.pop();
           }
        }
        
        
    }

    public int top() {
        
        return stack.peek();
       
        
    }

    public int getMin() {
        return minstack.peek();
        
    }
}
