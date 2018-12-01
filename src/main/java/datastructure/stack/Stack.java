package datastructure.stack;

public class Stack {
    public int top;
    private int[] stackArray;
    private int maxSize;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public Stack(){
        this.maxSize = 10;
        this.stackArray = new int[10];
        this.top = -1;
    }

    public void push(int element){
        if(this.top<this.maxSize-1){
            this.top++;
            this.stackArray[top] = element;
        }
    }

    public int pop(){
        int tempTop = top;
        this.top--;
        return this.stackArray[tempTop];
    }

    public int peak(){
        return this.stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (this.maxSize-1 == top);
    }
}
