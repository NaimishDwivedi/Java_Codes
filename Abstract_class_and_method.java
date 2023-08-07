abstract class A{
    public
    int age;
    String name;
    public abstract void display(int a, String n);
}


class B extends A {
    public void display(int a, String n){
        System.out.println("Name :"+n+" | Age: "+a);
    }
}

public class Abstract_class_and_method{
    public static void main(String a[]){
        B obj = new B();
        obj.display(18,"Naimish");
    }
}