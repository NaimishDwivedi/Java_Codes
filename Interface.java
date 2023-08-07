/*An interface is a completely "abstract class" that is used to group related methods with empty bodies.Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects) */

interface Male{
    public void eat();
}

interface Female{
     public void work();
}

class Human implements Male, Female{
    public void eat(){
        System.out.println("Eating...");
    }

    public void work(){
        System.out.println("Working...");
    }
}

class Interface{
    public static void main(String a[])
    {

        Human obj = new Human();
        obj.eat();
        obj.work();
    }
}