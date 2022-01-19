import java.util.Scanner;
public class DeletionFromArray 
{
    public static void main(String[] args)
    {
        try (Scanner S = new Scanner(System.in)) {
            int Size,pos=-1;
            int num;
            int i;
            System.out.println("\n Enter the size of array");
            Size=S.nextInt();
            int []x=new int[Size];
            System.out.println("\n Enter the number in array");
            for(i=0;i<Size;i++)
            {
                x[i]=S.nextInt();
            }
            System.out.println("\n Enter the num to be deleted: ");
            num =S.nextInt();
            for(i=0;i<Size;i++)
            {
                if(num == x[i])
                {
                    pos = i;
                    break;
                }
            }
            if(pos==-1)
            {
                System.out.println("\n NUmber not found.");
            }
            x[pos]=0;
            for(i=pos;i<Size-1;i++)
            {
                x[i]=x[i+1];
            }
            x[4]=0;
            System.out.println("\n List after the deletion.");
            for(i=0;i<Size;i++)
            {
                System.out.print(" "+x[i]);
            }
            S.close();
        }
    }
}