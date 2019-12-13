package com.el.ac.study.secondweek;

public class MyStack<T> {
  
  class Node {
    Node prev;
    Node next;
    T value;
  }
  
  private Node head;
  private Node tail;
  private int size;
  
  public T push(T item) {
    Node node = new Node();
    
    if (size == 0) {
      head = node;
      tail = node;
    }
    
    node.value = item;
    node.prev = tail;
    tail.next = node;
    
    tail = node;
    size++;

    return item;
  }
  
  public T pop() {
    T value;

    if (head == tail) {
      value = tail.value;
      tail.value = null;
      if (size > 0) size--;
      return value;
    }
    
    value = tail.value;
    tail = tail.prev;
    tail.next = null;
    
    size--;
    return value;
  }
  
  public T popAt(int index) {
    Node poppedNode = null;
    if (index == 0) {
      return size-- == 0 ? null : head.value;
    }
    
    for (int i = 0; i < index; i++)
      poppedNode = head.next;
    
    T value = poppedNode.value;
    poppedNode.prev.next = poppedNode.next;
    poppedNode.value = null;
    
    size--;
    return value;
  }
  
  
  public int size() {
    return size;
  }
  
}
