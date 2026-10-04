import java.util.Scanner;


public class ATMSystem
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println();

        float Balance = 75289.00f;

        
        System.out.println("===============================");
        
        System.out.println("\n1. Withdrawl\n2. Deposit\n3. check Balance \n4. Change Pin");
        
        System.out.println("===============================");
        
        System.out.println();


        System.out.print("\nSelect Service & Enter Number :  ");
        
        int n = sc.nextInt();
        

        switch(n)
        {
            case 1:
            System.out.print("Enter your amout : ");
            float Amount = sc.nextFloat();

            if(Amount < Balance )
            {
            System.out.println("Withdral Sucessfull!!");
             
            Balance  = Balance - Amount;

            System.out.println("Remaining Amount : "+Balance );
            }
            else if(Amount > Balance )
            {
                System.out.println("insufficient balance");
            }
           break;

           case 2 :
            System.out.print("\nEnter Your Amount : ");
            float Amount2 = sc.nextFloat();


            System.out.println("\nDeposit Sucsessfully!!!");

            Balance  = Balance + Amount2;

            System.out.println("\ncurrent Balance : "+ Balance );
            
            break;

            case 3 : 
            System.out.println("\nBalance : " +Balance);

            break;

            case 4 : 

            System.out.println("\nService not Available , Visit Nearest Branch");

            break;
            default : 
            System.out.println("Enter a Valid Number!!");

            
        }
        
        
    }
}
