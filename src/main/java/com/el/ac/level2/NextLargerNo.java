package com.el.ac.level2;

public class NextLargerNo {

  public int solution(int n) {
    String bin = Integer.toBinaryString(n);
    int count = 0, count2;
    
    for (int i = 0; i < bin.length(); i++)
      if (bin.charAt(i) == '1') count++;
    
    while (true) {
      count2 = 0;
      bin = Integer.toBinaryString(++n);
      
      for (int i = 0; i < bin.length(); i++)
        if (bin.charAt(i) == '1') count2++;
      
      if (count == count2) break;
    }
    
    return n;
  }

  public static void main(String[] args) {
    int n = 15;
    System.out.println(new NextLargerNo().solution(n));

  }

}
