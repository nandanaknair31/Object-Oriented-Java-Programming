abstract class Account
{
String cust_name;
String acc_no;

Account(String name, String acc)
{cust_name=name;
 acc_no=acc;}

public abstract void deposit(double amt);
public abstract void withdraw(double amt);
public abstract void display();
}

class sav_acct extends Account
{
String customer;
String account;
double balance;
double int_rate;

sav_acct(String customername, String accountno, double bal, double int_rate)
{super(customername, accountno);
 balance=bal;
 this.int_rate=int_rate;}

void deposit(double amt)
{
 balance+=amt;
 System.out.println("Deposited "+amt);
}

void withdraw(double amt)
{if (amt>balance)
 {System.out.println("Insufficient funds");}
 else
 {balance-=amt;
  System.out.println("Withdrew "+amt);}
}

void display()
{System.out.println("Savings account balance : "+balance);}

void computeinterest()
{double interest = (balance)*(int_rate*0.01);
 balance+=interest;}
}


class cur_acct extends Account
{String customer;
String account;
double balance;
double min;

cur_acct(String customername, String accountno, double bal, double m)
{super(customername, accountno);
 balance=bal;
 min=m;}

void deposit(double amt)
{
 balance+=amt;
 System.out.println("Deposited "+amt);
}

void withdraw(double amt)
{if (amt>balance)
 {System.out.println("Insufficient funds");}
 else
 {balance-=amt;
  System.out.println("Withdrew "+amt);}
}

void display()
{
int c = checkminbalance();
if (c)
{
System.out.println("Current account balance : "+balance);}
else 
{System.out.println("Balance does not meet minimum required balance");}
}

int checkminbalance()
{if (balance>=min)
 {return 1;}
else 
{balance-=100;
 return 0;}
}

public class Bank
{public static void main(String args[])
 {Scanner in = new Scanner(System.in);
  System.out.println("Enter the name of the customer : ");
  String name=in.nextLine();
  System.out.println("Enter the account number : ");
  String acc=in.nextLine();
  System.out.println("Enter 1 for savings account, Enter 2 for Current Account");
  int choice=in.nextInt();
  switch(choice)
  {case 1 : System.out.println("Enter balance of your account : ");
            double b=in.nextDouble();
            System.out.println("Enter interest rate : ");
            double r=in.nextInt();
            sav_acct s = new sav_acct(name, acc, b, r);
            while(choice==1)
	    {System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to compute and deposit interest, 4 to display balance and 0 to exit");
             int ch=in.nextint();
              switch(ch)
	      {case 1 : s.deposit();
                        break;
               case 2 : s.withdraw();
                        break;
	       case 3 : s.computeinterest();
                        break;
               case 4 : s.display();
                        break;
               case 0 : System.exit(0);
                        choice=10;
                        break;
	       default: System.out.println("Wrong choice");}
            }
 
  
     case 2 : System.out.println("Enter balance of your account : ");
            double b=in.nextDouble();
            System.out.println("Enter minimum balance");
            double mi=in.nextInt();
            cur_acct cur = new cur_acct(name, acc, b, mi);
            while(choice==2)
	    {System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to display balance and 0 to exit");
              int ch=in.nextint();
              switch(ch)
	      {case 1 : s.deposit();
                        break;
               case 2 : s.withdraw();
                        break;
	       case 3 : s.display();
                        break;
               case 0 : System.exit(0);
                        choice=10;
                        break;
	       default: System.out.println("Wrong choice");}
            }
 
   default : System.out.println("Wrong choice");

}
}
}





                        

