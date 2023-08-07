/*To access the abstract class, it must be inherited from another class.  */


abstract class Car{
    public abstract void drive();

    public void milege(int n){
        System.out.println("Milege is :"+n+" km/l");
    }
}

class Honda extends Car{
    public void drive(){
        System.out.println("The car is running...");
    }
}

class Java_Abstraction{
    public static void main(String a[]){
        Honda obj = new Honda();
        obj.drive();
    }
}