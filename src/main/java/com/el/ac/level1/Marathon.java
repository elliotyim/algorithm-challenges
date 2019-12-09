package com.el.ac.level1;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {

  public String mySolution(String[] participant, String[] completion) {
    String answer = "";
    Arrays.sort(participant);
    Arrays.sort(completion);
    
    for (int i = 0; i < completion.length; i++) {
      if (!participant[i].equals(completion[i])) {
        return answer = participant[i];
      }
      if (i == completion.length-1)
        return answer = participant[i+1];
    }
      
    return answer;
  }
  
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> hm = new HashMap<>();
    
    for (String player : participant)
      hm.put(player, hm.getOrDefault(player, 0) + 1);
    for (String player : completion)
      hm.put(player, hm.getOrDefault(player, 0) - 1);
    
    for (String key : hm.keySet()) {
      if (hm.get(key) != 0)
        answer = key;
    }
    return answer;
  }


  public static void main(String[] args) {
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};

    System.out.println(new Marathon().solution(participant, completion));
  }

}
