//package CodeAlpha
import java.util.Scanner;
class ATMInterface
{
	int Balance;
	int PIN = 60223;
	String yes;
	public void inputpin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Pin : ");
		int inputpin = scan.nextInt();
		if(inputpin == PIN)
		{
			menu();
		}
		else
		{
			System.out.println("Enter a Valid PIN");
		}
		scan.close();
	}
	public void menu()
	{
		
	
		System.out.println("Enter Your Choice : ");
		System.out.println("===========================");
		System.out.println("1.Check A/C Balance");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Deposit Amount");
		System.out.println("4.Transfer Amount");
		System.out.println("5.Quit");
		System.out.println("___________________________________________");
		System.out.println("    ");
		System.out.println("PLEASE ENTER THE CHOICE :");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1)
		{
			checkBalance();
		}
		else if (choose == 2)
		{
			withdrawAmount();
		}
		else if (choose == 3)
		{
			depositAmount();
		}
		else if (choose == 4)
		{
			transferAmount();
		}
		else if (choose == 5)
		{
			System.out.println("Thankyou Visit Again !!!!");	
		}
		else
		{
			System.out.println("Enter a Valid in Between Choosing !!!! ");
		}
		scan.close();
	}
	public void checkBalance()
	{
		System.out.println("Balance in Your Account : "+ Balance);
		menu();
	}
	public void withdrawAmount()
	{
		System.out.println("Enter Amount to Withdraw : ");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		if (amount > Balance)
		{
			System.out.println("Insufficient Funds !!!!");
		}
		else
		{
			Balance-= amount;
			System.out.println("Wait For Money >>>>>>>>");
			System.out.println("Money Withdrawn Successfull !!!!!!!!");
			System.out.println("Remaining Balance is : "+ Balance);
		}
		menu();
		scan.close();
	}
	public void depositAmount()
	{
		System.out.println("Enter The Amount To Be Deposit:");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		Balance = Balance + amount;
		System.out.println("Wait For a Moment !!!!!!");
		System.out.println("Amount Deposited Successfully >>>>>>");
		System.out.println("Balance is :"+ Balance);
		menu();
		scan.close();
	}
	public void transferAmount()
	{
		System.out.println("Enter the Transfer Amount: ");
		Scanner scan = new Scanner(System.in);
		int transfer = scan.nextInt();
		if (transfer > Balance)
		{
			System.out.println("INSufficient Funds");
		}
		else
		{
			Balance = Balance - transfer;
			System.out.println("Wait for A While......");
			System.out.println("Transferred SuccessFully >>>>>>>");
			System.out.println("Balance is :  "+Balance);
		}
		scan.close();
	}
}
class  Code_alpha_task_2
{
	public static void main(String[] args) 
	{
		ATMInterface i1 = new ATMInterface();
		i1.inputpin();
	}
}

