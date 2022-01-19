import java.util.Scanner;
public class SwapWithoutUsingThirdVariable
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int a,b;
            System.out.println("\n Enter the first number for swapping: ");
            a=s.nextInt();
            System.out.println("\n Enter the Second number for swapping: ");
            b=s.nextInt();
            System.out.println("\n The Number before Swapping are: "+a+" "+b);
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("\n The number after the swapping are: "+a+" "+b);
        }
    }    
}
