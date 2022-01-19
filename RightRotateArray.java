import java.util.Scanner;
public class RightRotateArray 
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
        int size,temp;
        System.out.println("\n Enter the size of array:");
        size=s.nextInt();
        int []x=new int[size];
        System.out.println("\n Enter the element to the array: ");
        int i;
        for(i=0;i<size;i++)
        {
            x[i]=s.nextInt();
        }
        temp=x[size-1];
        for(i=size-1;i>0;i--)
        {
            x[i]=x[i-1];
        }
        x[0]=temp;
        System.out.println("\n List after the right rotate: ");
        for(i=0;i<size;i++)
        {
            System.out.print(" "+x[i]);
        }
        s.close();
        }
    }
}
