package ThisKeyword;

public class FamilyInfo {
    int id;
    String name;
    String education;
    float salary;
     FamilyInfo(int id, String name, String education, float salary){
         this.id = id;
         this.name = name;
         this.education= education;
         this.salary= salary;
     }
     void familymethod(){
         System.out.println("id:" + id + " "+ "name :" + name + " "+ "Education : "+ " " + education + "salary :" + " " +salary);
     }

    public static void main(String[] args) {
        FamilyInfo FI = new FamilyInfo(1, "madhuri", "Msc Chemistry", 0000);
        FamilyInfo FI1 = new FamilyInfo(2, "sachin", "IT", 90000);
        FamilyInfo FI2 = new FamilyInfo(3, "nitin", "BE", 50000);
        FamilyInfo FI3 = new FamilyInfo(4, "nikita", "BE", 0000);
        FI.familymethod();
        FI1.familymethod();
        FI2.familymethod();
        FI3.familymethod();

    }

}

