package com.el.ac.level2;

public class CompleteSquares {
  
  private int gcd(int a, int b) {
    while(b!=0){
      int r = a%b;
      a = b;
      b = r;
    }
    return a;
  }
  
  public long solution(int w,int h) {
    long answer = 1L;
    int longerSide = Math.max(w, h);
    int shorterSide = Math.min(w, h);
    int gcd = gcd(longerSide, shorterSide);
    
    if (gcd == 1)
      answer = (long) w*h - (w+h-1);
    else
      answer = (long) w*h - (w+h-gcd);
    
    return answer;
  }

  public static void main(String[] args) {
    int w = 5;
    int h = 3;
    System.out.println(new CompleteSquares().solution(w, h));

  }

}
