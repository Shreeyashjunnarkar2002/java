import java.util.Scanner;
class Human5
{
    private String name,gender;
    private int age;
    public void setDetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter the name,gender and age");
        name=s.next();
        gender=s.next();
        age=s.nextInt();
        s.close();   
    } 
    public String getGender()
    {
        return(gender);
    }
    public void printDetails()
    {
        System.out.println("Name: "+name+"Gender: "+gender+"Age: "+age);
    }
}
public class ArrayOfObject2
{
    public static void main(String[] args)
    {
        Human5 s[]=new Human5[2];
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Human5();   //give memory to each object
            s[i].setDetails();
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println("\n In loop");
            if(s[i].getGender().compareTo("male")==0)
            {
                System.out.println("in loop");
                s[i].printDetails();
            }
        }

    }
}
