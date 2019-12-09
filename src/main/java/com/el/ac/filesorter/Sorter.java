package com.el.ac.filesorter;

import java.io.File;
import java.io.RandomAccessFile;

public class Sorter {

  void mergeSort(int[] values) {
    sort(values, 0, values.length-1);
  }

  void merge(int arr[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = arr[l + i];
    for (int j = 0; j < n2; j++)
      R[j] = arr[m + 1+ j];

    int i = 0, j = 0;

    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }

  }

  void sort(int[] arr, int l, int r) {

    if (l < r) {
      int m = (l+r)/2;
      sort(arr, l, m);
      sort(arr, m+1, r);

      merge(arr, l, m , r);
    }
  }

  public static void main(String[] args) {

    Sorter sorter = new Sorter();
    File file = new File("./the_file/file.file");

    try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
      System.out.println(Integer.toHexString(raf.readByte()));
      System.out.println(Integer.toHexString(raf.readByte()));
      System.out.println("============================");
      raf.skipBytes(2);
      System.out.println(Integer.toHexString(raf.readByte()));
      System.out.println(Integer.toHexString(raf.readByte()));
      System.out.println("============================");
      raf.skipBytes(2);
      System.out.println(Integer.toHexString(raf.readByte()));
      System.out.println(Integer.toHexString(raf.readByte()));
      System.out.println("============================");
      System.out.println(raf.getFilePointer());
    } catch (Exception e) {
      System.out.println("파일을 읽는 중 문제 발생");
    }
    
    int[] arr = {203, 821, 48, 381, 28, 19, 1, 98, 0};
    sorter.mergeSort(arr);
    System.out.print("{");
    for (int a : arr)
      System.out.print(a + ", ");
    System.out.println("}");

  }

}
