package com.el.ac.filesorter;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class FileGenerator {

  public static void main(String[] args) {
    new File (".the_file").mkdirs();

    File file = new File("./the_file/file.file");
    try {
      file.createNewFile();
      System.out.println("파일이 생성됨.");
    } catch (Exception e) {
      System.out.println("파일 생성 실패!");
    }

    try (BufferedOutputStream out = new BufferedOutputStream(
        new FileOutputStream(file, true))) {
      long before = System.currentTimeMillis();
      for (int j = 0; j < 10; j++)
        for (int i = 0; i < 8388608; i++) // 8MB 단위
          out.write(new Random().nextInt(128));
      long after = System.currentTimeMillis();

      SimpleDateFormat sdf = new SimpleDateFormat("mm분ss초");
      System.out.println("데이터를 쓰는데 걸린 시간: " + sdf.format(after-before));

    } catch (FileNotFoundException e) {
      System.out.println("파일을 찾을 수 없습니다.");
      e.printStackTrace();

    } catch (IOException e) {
      System.out.println("데이터 쓰기 실패");
      e.printStackTrace();
    }



  }

}
