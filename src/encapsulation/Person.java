package encapsulation;
public class Person {
    private String name;
    private int idNum;
    private int age;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getIdNum() {
        return idNum;
    }
    public void setAge( int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setIdNum( int newId) {
        idNum = newId;
    }
}
    class Encapsulation{
      public static void main(String args[]) {
        Person encap = new Person();
        encap.setName("madhuri");
        encap.setAge(24);
        encap.setIdNum(1234);
        System.out.print("Name : " + encap.getName() + " " + " Age : " + encap.getAge()+ " " + "IdNum: " + encap.getIdNum());
    }

}