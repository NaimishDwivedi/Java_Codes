public class Main{
    int age;
    public Main( int n)
    {
        age=n;
        System.out.println("Age is : "+age);
    }
    public void speed_Max(int s)
    {
        System.out.println("Maximum Speed of the car is : "+s+" km/h");
    }
    static void car_Name(String name)
    {
        System.out.println(" Name of the car is : "+name);
    }

    public static void main(String[] args)
    {
        //car_Name("BMW");
        Main obj = new Main (10);
        //obj.speed_Max(10);
    }
    
   

}