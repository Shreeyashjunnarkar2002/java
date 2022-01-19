public class Pattern8 {
    public static void main(String[] args)
    {
        int n=5;
        int k=2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" "+k);
                k+=2;
            }
            System.out.println();
        }
    }
    
}
