public class Constructors{
    int age;
    String name;
    public void display(){
        System.out.println("Name :"+name+" | Age : "+age);
    }

    Constructors(int x, String y){
        age=x;
        name=y;
    }


    public static void main(String a[])
    {

        Constructors obj=new Constructors(18,"Naimish");
        obj.display();

    }
}