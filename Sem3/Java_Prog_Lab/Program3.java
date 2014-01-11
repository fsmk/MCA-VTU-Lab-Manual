/*3. Write a JAVA program which has
i. A Class called Account that creates account with 500Rs minimum balance, a deposit()
method to deposit amount, a withdraw() method to withdraw amount and also throws
LessBalanceException if an account holder tries to withdraw money which makes the balance
become less than 500Rs.
ii. A Class called LessBalanceException which returns the statement that says withdraw
amount (___Rs) is not valid.
iii. A Class which creates 2 accounts, both account deposit money and one account tries to
withdraw more money which generates a LessBalanceException take appropriate action for
the same.*/
import java.util.*;
class LessBalanceException extends Exception
{
String msg;
LessBalanceException(String msg)
{
this.msg=msg;
}
public String toString()
{
return this.msg;
}
}
class account
{
int bal;
account()
{
bal=500;
}
void deposit(int amt,account ob)
{
ob.bal+=amt;
System.out.println("Balance amount"+ob.bal);
}
void withdraw(int w,account ob) throws LessBalanceException
{
if((ob.bal-w)<500) throw new LessBalanceException("Balance less than 500");
else
ob.bal-=w;
System.out.println("Balance amount"+ob.bal);
}
}
public class Program3 {
public static void main(String[] args) {
account ob1=new account();
account ob2=new account();
Scanner s=new Scanner(System.in);
for(;;)
{
System.out.println("1.Deposit");
System.out.println("2.Withdraw");
System.out.println("3.Exit");
System.out.println("Enter your choice");
int c=s.nextInt();
switch(c)
{
case 1: System.out.println("1.First account2.Second account");
int n=s.nextInt();
System.out.println("Enter the amount to be deposited");
int amt=s.nextInt();
if(n==1)
ob1.deposit(amt,ob1);
else
ob1.deposit(amt,ob2);
break;
case 2: System.out.println("1.First account2.Second account");
int n1=s.nextInt();
System.out.println("Enter the amount to be withdrawn");
int wdraw=s.nextInt();
try
{
if(n1==1)
ob1.withdraw(wdraw,ob1);
else
ob1.withdraw(wdraw,ob2);
}catch(LessBalanceException e)
{
System.out.println(e.toString());
}
break;
case 3: return ;
}
}
}
}
