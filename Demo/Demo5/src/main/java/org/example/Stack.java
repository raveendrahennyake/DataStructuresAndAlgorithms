package org.example;

//    Implement Stack Two Types;
//    Array Type;
//    Link list type;
//Array Type Implement Stack;
public class Stack {

    private int [] stack ;
    private int top;
    private int capacity;

     Stack (int size){
        stack=new int[size];
        top=-1;
        capacity=size;
    }
    public void push (int element){
        if (isfull()) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }else {
            stack[++top]=element;
            System.out.println(element + " pushed to stack.");
        }
    }
    public int pop (){
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }else {
            return stack[--top];
        }
    }
    public int peek (){
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }else {
            System.out.println("peek ele is "+stack[top] );
            return stack[top];
        }
    }
    public boolean isfull (){
        return top==capacity-1;
    }
    public boolean isEmpty (){
        return top==-1;

    }
    public void display (){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }else {
            for (int i=0;i<=top;i++){
                System.out.println(stack[i]+" ");
            }
        }
    }
}
