package Task_3;
/**
 * InnerMain
 */
import java.util.Scanner;
interface ATM
{
  public void deposit (int amt);
  public void Withdraw (int amt);
  public void checkbalance ();
}
class bank_user implements ATM
{
  private int balance;
  public String name;
  public bank_user (String name)
  {
	this.balance = 0;
	this.name = name;
  }
  public void deposit (int amt)
  {
	this.balance = this.balance + amt;
	System.out.println (amt + " is deposit to your account");
  }
  public void Withdraw (int amt)
  {
	if (amt < this.balance)
	  {
		this.balance = this.balance - amt;
		System.out.println (amt + " is Withdraw from your account");
	  }
	else
	  {
		System.out.println ("You have insufficient balance");
	  }
  }
  public void checkbalance ()
  {
	System.out.println ("Your Balance is " + this.balance);
  }
}

public class Main
{
  public static void main (String[]args) throws InterruptedException
  {
	Scanner sc = new Scanner (System.in);
	bank_user b1 = new bank_user ("Raj");
	    System.out.println("Hi "+b1.name+" welcome!");
	while (true)
	  {
		System.out.println ("1. deposit\t2. Withdraw");
		System.out.println ("3. checkbalance\t 4.exit");
		System.out.print ("Enter Your Choice:");
		int choice = sc.nextInt ();
		switch (choice)
		  {
		  case 1:
			System.out.print ("Enter Amount to deposit:");
			int amt = sc.nextInt ();
			  b1.deposit (amt);
			  break;
			case 2:
		   	  System.out.print ("Enter Amount to Withdraw:");
		      int Amt = sc.nextInt ();
			  b1.Withdraw (Amt);
			  break;
			case 3:
			    b1.checkbalance();
			    break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
		  }
		  	Thread.sleep (2000);
			System.out.print ("\033[H\033[2J");
			System.out.flush ();

        sc.close();
	  }
  }
}

