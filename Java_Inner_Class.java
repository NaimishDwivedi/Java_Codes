/*In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:*/

class Outer{
    int age = 18;

    class Inner{
        String name = "Naimish";
    }
}

class Java_Inner_Class{
    public static void main(String a[]){
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        System.out.println("Age : "+obj.age+"\nName: "+obj1.name);

    }
}