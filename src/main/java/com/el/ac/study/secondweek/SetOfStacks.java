package com.el.ac.study.secondweek;

import java.util.ArrayList;
import java.util.List;

public class SetOfStacks {

  List<MyStack<Object>> stacks = new ArrayList<>();
  int maxPile = 10;
  int index = 0;
  
  public SetOfStacks() {
    stacks.add(new MyStack<Object>());
  }
  
  public void push(Object item) {
    stacks.get(index).push(item);
    if (stacks.get(index).size() == maxPile) {
      stacks.add(new MyStack<Object>());
      index++;
    }
  }
  
  public void pop(Object item) {
    stacks.get(index).pop();
    if (stacks.get(index).size() == 0) {
      stacks.remove(index);
      index--;
    }
  }
  
}
