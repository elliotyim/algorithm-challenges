package com.el.ac.unsolved;

import java.util.ArrayList;
import java.util.List;

// N으로 표현 (미해결)
public class ExpressionByN {
  
  public int solution(int N, int number) {
    int answer = 0;
    int[] expressionWay = new int[3];

    //
    int temp = number/N;
    int temp2 = number%N;
    expressionWay[0] = temp+(temp2*2);
    
    //
    String temp3 = String.valueOf(number);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < temp3.length(); i++)
      sb.append(N);
    
    int temp4 = Integer.parseInt(sb.toString());
    int temp5 = (number/(temp4/N))*3;
    int temp6 = (number%(temp4/N))*2;
    
    expressionWay[1] = temp5+temp6;
    
    //
    int temp7;
    
    System.out.println(expressionWay[0]);
    System.out.println(expressionWay[1]);
    System.out.println(expressionWay[2]);
    
    return answer;
  }
  
  public void temp() {
    List<Integer> numbers = new ArrayList<>();
    int number = 2796;
    for (int i = 2; i <= number; i++) {
      while (number % i == 0) {
        number /= i;
        numbers.add(i);
      }
    }
  }
  
  public static void main(String[] args) {
    int N = 2;
    int number = 11;
//    new Solution04().solution(N, number);
    new ExpressionByN().temp();
  }
}
