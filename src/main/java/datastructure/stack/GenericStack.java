package datastructure.stack;

import java.lang.reflect.Array;

public class GenericStack<T> {
    public int top;
    private T[] stackArray;
    private int maxSize;

    public GenericStack(Class<T> clazz, int maxSize){
        this.maxSize = maxSize;
        this.stackArray = (T[]) Array.newInstance(clazz, this.maxSize);
        this.top = -1;
    }

    public GenericStack(Class<T> clazz){
        this.maxSize = 10;
        this.stackArray = (T[]) Array.newInstance(clazz, this.maxSize);
        this.top = -1;
    }

    public void push(T element){
        if(this.top<this.maxSize-1){
            this.top++;
            this.stackArray[top] = element;
        }
    }

    public T pop(){
        int tempTop = top;
        this.top--;
        return this.stackArray[tempTop];
    }

    public T peak(){
        return this.stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (this.maxSize-1 == top);
    }
}
