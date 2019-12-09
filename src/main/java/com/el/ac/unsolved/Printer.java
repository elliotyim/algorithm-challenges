package com.el.ac.unsolved;

import java.util.Arrays;

public class Printer {

  public int solution(int[] priorities, int location) {
    int answer = 0;
    
    int[] tempArr = Arrays.copyOf(priorities, priorities.length);
    Arrays.sort(priorities);
    for (int p : priorities)
      System.out.println(p);
    System.out.println("================");
    for (int t : tempArr)
      System.out.println(t);
    
    return answer;
  }

  public static void main(String[] args) {
    int[] priorities = {2,1,3};
    int location = 0;
    System.out.println(new Printer().solution(priorities, location));

  }

}
