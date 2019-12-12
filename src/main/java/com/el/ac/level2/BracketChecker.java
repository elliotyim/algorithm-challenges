package com.el.ac.level2;

import java.util.Stack;

public class BracketChecker {

  private String amendParentheses(String p1) {
    
    return "";
  }

  public String solution(String p) {
    String answer = "";
    int length = p.length();
    int count = 0;
    Stack<String> s = new Stack();

    for (int i = 0; i < p.length(); i++) {
      String thisString = p.substring(i,i+1);
      try {
        if (thisString.equals("("))
          s.push(thisString);
        else
          s.pop();
      } catch (Exception e) {
        answer = 
            amendParentheses(p.substring(0,i+1))
            + amendParentheses(p.substring(i+1));
        break;
      }
    }








    //    for (int i = 0; i < p.length(); i++) {
    //      String thisString = p.substring(i,i+1);
    //      if (thisString.equals("(")) {
    //        s.push(thisString);
    //      } else {
    //        if (!s.isEmpty()) {
    //          s.pop();
    //          answer.append(")");
    //        }
    //      }
    //    }

    return answer;
  }

  public static void main(String[] args) {
    String p = "()))((()";
    System.out.println(new BracketChecker().solution(p));


  }

}
