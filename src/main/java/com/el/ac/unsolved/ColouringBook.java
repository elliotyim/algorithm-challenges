package com.el.ac.unsolved;

import java.util.HashSet;
import java.util.Stack;

public class ColouringBook {
  
  int dx[] = {-1, 0, 1, 0};
  int dy[] = {0, 1, 0 ,-1};
  boolean[][] visited;

  private void dfs(int x, int y, int m, int n, int[][] picture) {
    visited[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      
      if (0 <= nx && nx < n &&
          0 <= ny && ny < m) {
        if (picture[nx][ny] == 1 &&
            visited[nx][ny] == false) {
          dfs(nx, ny, m, n, picture);
        }
      }
      
    }
  }

  public int[] solution(int m, int n, int[][] picture) {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;

    Stack<Integer> unit = new Stack<>();
    HashSet<Integer> unitId = new HashSet<>();

    this.visited = 
        new boolean[picture[0].length-1][picture.length-1];

    for (int i = 0; i < picture[0].length; i++) {
      for (int j = 0; j < picture.length; j++) {
        if (picture[j][i] > 0) {
          unitId.add(picture[j][i]);
        }
      }
    }

    numberOfArea = unitId.size();

    int[] answer = new int[2];
    answer[0] = numberOfArea;
    answer[1] = maxSizeOfOneArea;

    return answer;
  }

  public static void main(String[] args) {
    int[][] picture = null;
    new ColouringBook().solution(6, 4, picture);

  }

}
