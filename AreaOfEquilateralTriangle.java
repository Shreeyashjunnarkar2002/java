import java.util.Scanner;
public class AreaOfEquilateralTriangle
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int side;
            float area;
            System.out.println("\n Enter the length of side: ");
            side=s.nextInt();
            area=(float)(Math.sqrt(3)*(side*side))/4;
            System.out.println("\n Area of Equilateral Triangle: "+area);
        }
    }    
}
