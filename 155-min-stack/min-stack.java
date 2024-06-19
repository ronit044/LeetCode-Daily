class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            int top = st.pop();
            if (top == minSt.peek()) {
                minSt.pop();
            }
        }
    }
    
    public int top() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if (!minSt.isEmpty()) {
            return minSt.peek();
        }
        return 0;
    }
}
