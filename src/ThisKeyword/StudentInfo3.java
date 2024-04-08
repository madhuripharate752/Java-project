package ThisKeyword;

public class StudentInfo3 {
    // With This Keyword
    int id;
    String name;
    StudentInfo3(int id, String name) {
      this. id = id;
        this. name = name;
   }
           void Information(){
       System.out.println(id + "  " + name);
    }

    public static void main(String[] args) {
        StudentInfo3 S1 = new StudentInfo3(1, "Madhuri");
        StudentInfo3 S2 = new StudentInfo3(2, "sachin");
        StudentInfo3 S3 = new StudentInfo3(3,"Rudransh");
        S1.Information();
        S2.Information();
        S3.Information();


    }
}
