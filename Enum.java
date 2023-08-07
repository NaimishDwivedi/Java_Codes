/*An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).*/


// public class enumeration {
//     enum level{
//         FYCS, SYCS, TYCS
//     }
    
//     public static void main(String a[]){
//         // level var = level.FYCS;
//         // System.out.println(var);

//         for(level  var : level.values()){
//             System.out.println(var);
//         }


//     }
// }

enum Standard{
    FYCS, SYCS, TYCS;
}

public class Enum{
    public static void main(String a[]){
        for ( Standard var: Standard.values()){
            switch (var){
                case FYCS:
                    System.out.println("YOU ARE IN FYCS");
                    break;
                case SYCS:
                    System.out.println("YOU ARE IN SYCS");
                    break;
                case TYCS:
                    System.out.println("YOU ARE IN TYCS");
                    break;

                default:
                    System.out.println("INVALID");
                }
        } 
    }
}


