import java.util.Scanner;
public class LargestAmongNDigit
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int max,i;
            int size;
            System.out.println("\n Enter the size of array: ");
            size=s.nextInt();
            int x[]=new int[size];
            System.out.println("\n Enter the number in array: ");
            for(i=0;i<size;i++)
            {
                x[i]=s.nextInt();
            }
            max=x[0];
            for(i=0;i<size;i++)
            {
                if(max<=x[i])
                {
                    max=x[i];
                }
            }
            System.out.println("\n The maximum no in array: "+max);
        }
    }    
}
