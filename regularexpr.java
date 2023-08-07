import java.util.regex.*;


public class regularexpr {
    public static void main(String a[]){
        Pattern pattern = Pattern.compile("naimish", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Naimish Dwivedi");

        boolean match = matcher.find();

        if ( match) {
            System.out.println("Match found");

        }

        else {
            System.out.println("Match not found");
        }
    }

    
}
