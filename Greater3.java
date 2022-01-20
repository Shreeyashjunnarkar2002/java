import java.util.Scanner;
public class Greater3
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int a,b,c,max;
            System.out.println("\n Enter the three number: ");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            max=(a>b&&a>c)?a:(b>c)?b:c;
            System.out.println("\n The Greater Number between 3 number is: "+max);
        }
    } 
}
