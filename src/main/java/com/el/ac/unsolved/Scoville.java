package com.el.ac.unsolved;

import java.util.Arrays;

public class Scoville {

  public int solution(int[] scoville, int K) {
    int answer = 0;
    
    Arrays.sort(scoville);
    if (scoville[0] > K)
      return answer;
    
    int firstSpicyFood = scoville[0];
    int secondSpicyFood = scoville[1];
    int mixedFood = scoville[0] + scoville[1]*2;
    answer++;
    
    int[] temp = Arrays.copyOfRange(scoville, 2, scoville.length);
    
    
    return answer;
  }
  
  public static void main(String[] args) {
    int[] scoville = {1,2,3,9,10,12};
    int K = 7;
    
    new Scoville().solution(scoville, K);

  }

}
