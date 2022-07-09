public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int n){
        stack = new int[n];
        top = -1;
        capacity = n;
    }
    public int size(){
        return (top + 1);
    }
    public boolean isFull(){
        return (top == capacity - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int val){
        if(isFull()){
            System.out.println("stack is full!");
            return;
        }
        ++top;
        stack[top] = val;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        --top;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }

    public void printStack(){
        System.out.println("ele in stack:");
        for(int i = top; i >=0; --i){
            System.out.println("|" + stack[i] + "|");
        }
        System.out.println("===");
    }

    public static void main(String[] args){
        Stack s = new Stack(5);
        s.push(2);
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
        s.printStack();
    }
}
