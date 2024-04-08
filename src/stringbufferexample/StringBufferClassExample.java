package stringbufferexample;

import Constructor.StudentInfo;
import ThisKeyword.FamilyInfo;

public class StringBufferClassExample{
      public static void main(String[] args) {
          String name = "StudentInfo";
          System.out.println(name);
          String s1 = name.replace("StudentInfo", "FamilyInfo");
          System.out.println(s1);
      }
  }
