import java.util.Scanner;
public class AreaOfRectangle
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int length;
            int breadth;
            int area;
            System.out.println("\n Enter the Length of Rectangle: ");
            length=s.nextInt();
            System.out.println("\n Enter the Breadth of Rectangle: ");
            breadth=s.nextInt();
            area=length*breadth;
            System.out.println("\n Area of Recatngle: "+area);
        }
    }    
}
