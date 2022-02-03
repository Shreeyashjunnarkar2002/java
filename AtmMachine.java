import java.util.Scanner;
public class AtmMachine
{    
    public static void main(String[] args)
    {
        int balance=1000, withdraw=0, deposite=0;
        try(Scanner s=new Scanner(System.in))
        {
        while(true)
        {
            System.out.println("***Automated teller machine***");
            System.out.println("Choose 1 withdraw");
            System.out.println("Choose 2 deposite");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Choose Operation: ");
            int n=s.nextInt();
            switch(n)
            {
                case 1 :
                        System.out.println("Enter the money to Withdraw: ");
                        if(balance>=withdraw)
                        {
                            withdraw=s.nextInt();
                            balance=balance-withdraw;
                        }
                        else
                        {
                            System.out.println("Insufficient balance.");
                        }
                        System.out.println(" ");
                        break;
                case 2 :
                        System.out.println(" Enter the money to be deposited: ");
                        deposite=s.nextInt();
                        deposite=deposite+balance;
                        System.out.println("Your money has deposited Succesfully....");
                        System.out.println(" ");
                        break;
                case 3 : 
                        System.out.println("Balance: "+balance);
                        System.out.println(" ");
                        break;
                case 4 : 
                        System.exit(0);
            }
        }
        }
    }
}
