import java.util.Scanner;
public class Array2
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
        int size;
        System.out.println("\n Enter the size of array: ");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("\n Enter the number in array: ");
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("\n The Element of Array is: ");
        for(int i=0;i<size;i++)
        {
            System.out.println("Value at arr["+i+"] is "+a[i]);
        }
        }
    }    
}
