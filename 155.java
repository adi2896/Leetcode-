/*155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/

class MinStack {

    Stack<Integer> s = new Stack();
    Stack<Integer> ms = new Stack();
    
    public void push(int x) 
    {
        if(ms.isEmpty() || x <= ms.peek())
        {
            ms.push(x);
        }
        s.push(x);
    }
    
    public void pop() 
    {
        if(s.peek().equals(ms.peek()))
        {
            ms.pop();
        }
        s.pop();
    }
    
    public int top() 
    {
        return s.peek();
    }
    
    public int getMin() 
    {
        return ms.peek();     
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */