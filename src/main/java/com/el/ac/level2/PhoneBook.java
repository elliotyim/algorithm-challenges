package com.el.ac.level2;

// 전화번호 목록
public class PhoneBook {
  
  public boolean solution(String[] phone_book) {
    boolean answer = true;
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = 0; j < phone_book.length; j++) {
        if (phone_book[i].equals(phone_book[j]))
          continue;
        
        if (phone_book[i].length() < phone_book[j].length() &&
            phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length())))
          return false;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    String[] phone_book = {"12", "123", "1235", "567", "88"};
    System.out.println(new PhoneBook().solution(phone_book));
  }
  
}
