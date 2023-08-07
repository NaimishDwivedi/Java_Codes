/*An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.  */
import java.util.*;

public class Iter {
    public static void main(String a[]){
    
    ArrayList<String> city = new ArrayList<String>();
    city.add("Thana");
    city.add("Kalyan");
    city.add("Mumbra");
    city.add("Diva");

    Iterator <String> ite = city.iterator();

    // System.out.println(ite.next());
    // System.out.println(ite.next());
    // System.out.println(ite.next());
    // System.out.println(ite.next());

    // Looping Through a Collection

    // while(ite.hasNext()){
    //     System.out.println(ite.next());
    // }
     while(ite.hasNext()){
        System.out.println(ite.next());
    }
    // while( ite.hasNext()){
    //     String s = ite.next();
    //     if (s == "Mumbra"){
    //         ite.remove();
    //     }


    // }

    city.removeIf(n-> (n.charAt(0)=='M'));

    System.out.println(city);

    // while(ite.hasNext()){
    //     System.out.println(ite.next());
    // }
    
}
    
}

