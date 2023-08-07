import java.util.*;

class Hash_Map {
    public static void main(String[] a){

    HashMap<Integer, String> student = new HashMap<Integer , String>();
    student.put(13, "Naimish");
    student.put(5, "Rupesh");
    student.put(18, "Yadnesh");

    for(int i : student.keySet()){
        System.out.println("Roll No. : "+i+" - Name :"+student.get(i));
    }

    // To remove an item, use the remove() method and refer to the key

    // student.clear();

    
    
}
}
