package com.el.ac.level2;

public class Towers {

  public int[] solution(int[] heights) {
    int[] answer = new int[heights.length];
    for (int send = 1; send < heights.length; send++) {
      for (int received = send-1; received >= 0; received--) {
        if (heights[received] > heights[send]) {
          answer[send] = received+1;
          break;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    
    int[] heights = {1,5,3,6,7,6,5};
    int[] answer = new Towers().solution(heights);
    
    for (int i = 0; i < answer.length; i++)
      System.out.print(answer[i]+",");
    
  }

}
