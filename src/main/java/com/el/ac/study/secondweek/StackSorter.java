package com.el.ac.study.secondweek;

import java.util.Stack;

public class StackSorter<T> {
  
  public void sort(Stack<Integer> stack) {
    Stack<Integer> tempStack = new Stack<>();

    while(!stack.isEmpty()) {
      int temp = stack.pop();
      
      while(!tempStack.isEmpty() && tempStack.peek() > temp)
        stack.push(tempStack.pop());
      
      tempStack.push(temp);
    }
    
    while (!tempStack.isEmpty())
      stack.push(tempStack.pop());
  }
  
}
