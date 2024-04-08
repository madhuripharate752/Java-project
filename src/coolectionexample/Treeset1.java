package coolectionexample;
import java.util.*;
public class Treeset1 {
        public static void main(String args[]){
            TreeSet<String> name =new TreeSet<String>();
            name.add("Ravi");
            name.add("Vijay");
            name.add("Ravi");
            name.add("Ajay");
            Iterator<String> itr=name.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
