package com.el.ac.unsolved;

import java.util.Arrays;

// H-Index (미해결)
public class HIndex {
  
  public int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);
    int count = 0;
    for (int i = citations.length-1; i >= 0; i--) {
      count++;
      
      if (count < citations[i])
        continue;
      
      answer = count;
      if (count < citations.length/2) {
        if (answer > citations[i-1]) {
          break;
        }
        continue;
      } else {
        break;
      }
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    int[] citations = {1, 2, 3, 3, 4, 4, 4, 5, 5};
    System.out.println(new HIndex().solution(citations));
  }
}
