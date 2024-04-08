package coolectionexample;
import java.util.*;
public class HashmapExample {
        public static void main(String args[]){
            HashMap<Integer,String> map=new HashMap<Integer,String>();
            map.put(1,"Mango");
            map.put(2,"Apple");
            map.put(3,"Banana");
            map.put(1,"Grapes"); //trying duplicate key

            System.out.println("Iterating Hashmap...");
            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }


