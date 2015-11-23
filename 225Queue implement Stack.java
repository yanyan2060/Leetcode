class MyStack {
    // Push element x onto stack.
    private Queue<Integer> que = new LinkedList<>();
    //private Queue<Integer> que2 = new LinkedList<>();
    public void push(int x) {
        que.offer(x);
        
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        for (int i = 0; i < que.size() - 1; i++) {
            int top = que.poll();
            que.offer(top);
        }
        que.poll();
        
    }

    // Get the top element.
    public int top() {
        for (int i = 0; i < que.size() - 1; i++){
            int to = que.poll();
            que.offer(to);
        }
        int p = que.peek();
        que.offer(que.poll());
        return p;
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return que.isEmpty();
    }
}
