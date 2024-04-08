package Constructor;

public class StudentInfo {
    //parameter constructor
    int id;
    String name;
    StudentInfo(int id, String name) {
        System.out.println("ID==" + id + " " + "Name=="  + name);
    }

    public static void main(String[] args) {
        StudentInfo ID = new StudentInfo (1, "madhuri");

    }
    }
