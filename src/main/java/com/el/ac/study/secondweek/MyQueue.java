package com.el.ac.study.secondweek;

import java.util.Stack;

public class MyQueue<T> {
  
  Stack<T> stack = new Stack<>();
  
  public T offer(T item) {
    return stack.push(item);
  }
  
  public T poll() {
    return stack.isEmpty() ? null : stack.remove(0);
  }
  
  public T peek() {
    return stack.isEmpty() ? null : stack.get(0);
  }
  
  public int size() {
    return stack.size();
  }
  
}
