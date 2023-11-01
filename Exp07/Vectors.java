
import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();

        mammals.add("Dog");
        mammals.add(1,"Horse ");

        System.out.println("Mammals:" + mammals);
        System.out.println();

        Vector<String> animals= new Vector <>();

        animals.add("Crocodile");
        animals.add("Whale");
        animals.add("Duck");
;
        
        System.out.println("Animals: "+ animals);
        System.out.println();

        animals.addAll(mammals);
        System.out.println("Extended Mammals:"+animals);
        System.out.println();

        String element= animals.get(2);
        System.out.println("Element at index 2:"+element);
    }
}