class MinStack 
{
    int man = Integer.MAX_VALUE;
    Stack<Integer>st = new Stack<>();
    // public MinStack() {
        
        
    // }
    
    public void push(int val) {
        if(val<=man){
            st.push(man);
            man = val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop()==man)
        man = st.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return man;
        
    }
}

