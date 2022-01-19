import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        try(Scanner s  =new Scanner(System.in))
        {
        int x;
        System.out.println("Enter one integer: ");
        x=s.nextInt();
        if(x%2==0)
        {
            System.out.println("\n number is even.");
        }
        else{
            System.out.println("\n number is odd.");
        }
        s.close();
        }
    }
}