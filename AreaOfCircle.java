import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int radius;
            float area;
            System.out.println("\n Enter the Radius of circle: ");
            radius=s.nextInt();
            area=(float)(3.14*radius*radius);
            System.out.println("\n Area of circle is: "+area);
        }
    }    
}
