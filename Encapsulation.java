class A{
    private
    int age;
    public int getage(){
        return age;
    }
    public void setage(int n)
    {
        this.age=n;
    }
}
// class B extends A{
   
// }

public class Encapsulation{
    public static void main(String a[]){
    A obj = new A();
    obj.setage(18);
    System.out.println("Age is:"+obj.getage());
}
}