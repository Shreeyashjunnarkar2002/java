import java.util.Scanner;
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int b,h;
            float area;
            System.out.println("\n Enter value of Breadth and Height: ");
            b=s.nextInt();
            h=s.nextInt();
            area=(float)(b*h)/2;
            System.out.println("\n Area of Triangle is: "+area);
        }
    }    
}
