package com.el.ac.unsolved;

public class OneTwoFour {
  
  public String solution(int n) {
    String answer = "";
    int number = 1;
    
    for (int i = 2; i <= n; i++) {
      String str = String.valueOf(number);
      char lastDigitNo = str.charAt(str.length()-1);

      number += (lastDigitNo - 48);
      answer = String.valueOf(number);
      
      for (int j = 1; j <= answer.length(); j++) {
        String tempStr = String.valueOf(number);
        char temp2 = tempStr.charAt(tempStr.length()-j);
        int ten = (int) Math.pow(10, j);
        if (temp2 == '8') {
          number -= 7*ten/10;
          number += 1*ten;
          temp2+=1;
        }
        if (temp2 == '3') {
          number += 1*ten/10;
        }
      }
    }
    
    answer = String.valueOf(number);
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(new OneTwoFour().solution(13));
  }

  
}
