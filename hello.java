import java.util.Scanner;

class Hello
{
    static void getSum(int n1,int n2)
  {
    System.out.println("Sum is:" +( n1 + n2));
  } 
 /* static String getVote(int age)
  {
    return (if age>=18 ) ? "You are eligible to vote": "You are not eligible to vote" ;
  }*/
  public static int rangeSum(int k)
  {
    if(k>0)
        return k + rangeSum(k-1);
    
    else
        return 0;
  }
   
public static void main(String [] args)
{
    //int num1=5;
    /*double num2=6d;
    int num1=(int)num2;
    System.out.println(num2);*/


    //String name="naimish Dwivedi";
    //System.out.println(name.indexOf("Mish"));
     //System.out.println(name+6);
     /*int age=13;
     String result = (age>=18) ? "You are elgible to vote " : "You are ineligible to vote";
     System.out.println(result);*/
    /*Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the day number :");
    byte day = myObj.nextByte();
    System.out.println("Day is : " + day);
    switch(day)
    {
        case 1:
            System.out.println("It's Monday ");
            break;
        case 2:
            System.out.println("It's Tuesday ");
            break;
        case 3:
            System.out.println("It's Wednesday ");
            break;
        case 4:
            System.out.println("It's Thursday ");
            break;
        case 5:
            System.out.println("It's Friday ");
            break;
        case 6:
            System.out.println("It's Saturday ");
            break;
        case 7:
            System.out.println("It's Sunday ");
            break;
        default:
            System.out.println("Invalid Input ");
    }*/

   /* int a;
    System.out.println("Enter the value ");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    System.out.println("Value of the number is :"+a);
    */
   /*String[] name={"Aniket","Naimish","Pravish"};
   for(String i:name)
   {
    System.out.println("Name is : "+i);
   }
    System.out.println(name.length);
    */

  /* int [][] num={{1,2,3},{4,5,6}};
   for(int i=0;i<num.length;i++)
   {
    for(int j=0;j<num[i].length;j++)
    {
        System.out.println(num[i][j]);
    }
   }
   */
  //getSum(5,6);
  int res=rangeSum(10);
  System.out.println(res);
  

















}

}