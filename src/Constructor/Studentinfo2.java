package Constructor;

public class Studentinfo2 {
    int id;
    String name;
    Studentinfo2(){
        System.out.println(id+ "  " +name);
    }

    public static void main(String[] args) {
        Studentinfo2 ID = new Studentinfo2();
        Studentinfo2 Name = new Studentinfo2();
    }

}
