import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int n,fact=1;
            System.out.println("\n Enter the number: ");
            n=s.nextInt();
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("\n Factorial of "+n+" is "+fact);
        }
    }   
}
