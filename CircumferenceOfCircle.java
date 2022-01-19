import java.util.Scanner;
public class CircumferenceOfCircle
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int radius;
            float cir;
            System.out.println("\n Enter Radius of circle: ");
            radius=s.nextInt();
            cir=(float)(2*3.14*radius);
            System.out.println("\n Circumference of circle is: "+cir);
        }
    }    
}
