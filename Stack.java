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
            capacity *= 2;
            int[] tmp = stack;
            stack = new int[capacity];
            for(int i = 0; i <= top; i++){
                stack[i] = tmp[i];
            }
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
        System.out.print("[");
        for(int i = 0; i <= top; ++i){
            System.out.print(stack[i] + ",");
        }
        System.out.print("\b]");
        System.out.println();
    }

    public static void main(String[] args){
        Stack s = new Stack(5);
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.pop();
        s.printStack();
    }
}