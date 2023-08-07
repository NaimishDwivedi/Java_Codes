public class exception {
    public static void main(String a[]){
        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[6]);

        }
        catch(Exception e)
        {
            System.out.println("Index out of range");
        }

        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
    
}
