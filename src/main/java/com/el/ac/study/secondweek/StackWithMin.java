package com.el.ac.study.secondweek;

import java.util.Stack;

public class StackWithMin extends Stack<Integer> {

  Stack<Integer> s2;

  public StackWithMin() {
    s2 = new Stack<>();
  }

  public int min() {
    if (s2.isEmpty())
      return Integer.MAX_VALUE;
    else
      return (int) s2.peek();
  }

  // 넣으려는 값이 최소값인 경우 O(2)
  public void push(int value) {
    if (value <= min())
      s2.push(value);
    super.push(value);
  }

  // 빼려는 값이 최소값인 경우 O(3)
  public Integer pop() {
    int value = super.pop();
    if (value == min())
      s2.pop();
    return value;
  }

}
