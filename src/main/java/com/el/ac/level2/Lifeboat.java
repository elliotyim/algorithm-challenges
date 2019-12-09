package com.el.ac.level2;

import java.util.Arrays;

// 구명보트
public class Lifeboat {
  public int solution(int[] people, int limit) {
    int answer = 0;
    int foreIndex = 0;
    int backIndex = people.length-1;
    int currentBoardWeight = 0;

    Arrays.sort(people);

    while (foreIndex < backIndex) {
      currentBoardWeight = 0;
      currentBoardWeight += people[backIndex];
      backIndex--;

      while (true) {
        if ((currentBoardWeight+people[foreIndex]) > limit)
          break;

        currentBoardWeight += people[foreIndex];
        foreIndex++;
      }
      answer++;
      
      if (foreIndex == backIndex)
        answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] people = {50, 50, 70, 80, 50};
    int limit = 100;
    System.out.println(new Lifeboat().solution(people, limit));
  }
}
