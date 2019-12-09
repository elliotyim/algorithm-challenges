package com.el.ac.level2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Poncketmon {
  
  public int solution(int[] nums) {
    Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    
    if (s.size() < nums.length/2)
      return s.size();
    else
      return nums.length/2;
    
  }

  public static void main(String[] args) {
    int[] nums = {3,1,2,3};
    System.out.println(new Poncketmon().solution(nums));

  }

}