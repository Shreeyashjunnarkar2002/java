import java.util.Scanner;
class Human4
{
    private String name,gender;
    private int age;
    public void getDetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter the name,gender,age");
        name=s.nextLine();
        gender=s.nextLine();
        age=s.nextInt();
        s.close();
    }
    public void printDetails()
    {
        System.out.println("\n Name: "+name);
        System.out.println("\n Gender: "+gender);
        System.out.println("\n Age: "+age);
    }
}
public class ArrayOfObject
{
    public static void main(String[] args)
    {
        Human4 h[]=new Human4[2];
        for(int i=0;i<h.length;i++)
        {
            h[i]=new Human4();
            h[i].getDetails();
        }
        for(int i=0;i<h.length;i++)
        {
           h[i].printDetails();
        }
    }
}
