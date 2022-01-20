import java.util.Scanner;
public class TableUsingForLoop
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int num,i;
            System.out.println("\n Enter the Number for Table Creation: ");
            num=s.nextInt();
            for(i=1;i<=10;i++)
            {
                System.out.println(num*i);
            }
        }
    }    
}
