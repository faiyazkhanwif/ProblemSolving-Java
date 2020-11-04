/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author faiya
 */
public class MyStack<T> {
        //declare maxSize for the stack
    int maxSize;
    // top = where last position of stack is
    int top;
    // an array to store data
    T arr[];   
    
    
    public MyStack(int n){
        maxSize = n;
        top = 0;                    // points to index 0
        //arr = new String[maxSize];
        arr = (T[])new Object[maxSize];
    }
    
    public boolean empty(){
        if (top == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(T str){
        if (top < maxSize){
            arr[top] = str;             // push to space allocated   
            top++;                      // shift pointer to next space
        }
        else{
            System.out.println("Stack overflow!!! Stack has reached maxSize..");
        }
        
    }
    public void clear(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }
    
    public T pop(){
        if(!this.empty()){
            //create a temp to copy value 
            T temp = this.peek();
            arr[top-1] = null;
            top--;
            return temp;
        }
        else{
            return null;
        }
    } 
    
    public T peek(){
        if(top > 0){
            return arr[top-1];      //return last value pushed into stack (fist in last out)
        }
        else{
            return null;
        }        
    }
    
    public void display(){
        for(int i=0; i<top; i++){         // test with maxSize instead of top
            System.out.println(arr[i]);
        }
    }
    
    public void reverseDisplay(){
        for(int i=top-1; i>=0; i--){         // test with maxSize instead of top
            System.out.println(arr[i]);
        }
    }
    
    public void pushMany(String ss){
        String[] temp = ss.split(" ");
        for(int i=0; i<temp.length; i++){
            push((T)temp[i]);
        }    
    }
    public int size(){
        return arr.length;  
    }
}
