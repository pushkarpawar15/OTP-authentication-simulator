//Main file
package main; 
import java.util.*;
public class ATM {
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	while(true)
	{
		String s = in.nextLine();
		String[] ss = new String[3];
		ss = s.split(" ");
		if(Objects.equals(ss[0],"C"))
		{
			bank.addCustomer(Integer.parseInt(ss[1]));
		}
		else if(Objects.equals(ss[0],"A"))
		{
			bank.addAccount(Integer.parseInt(ss[1]),Integer.parseInt(ss[2]));
		}
		else if(Objects.equals(ss[0],"B"))
		{
			bank.sendOTPforBalanceCheck(Integer.parseInt(ss[1]));
		}
		else if(Objects.equals(ss[0],"V"))
		{
			int bal = bank.verifyOTPandGetBalance(Integer.parseInt(ss[1]),Integer.parseInt(ss[2]));
			if(bal == 0)
			{
				System.out.println("Invalid OTP");
			}
			else
			{
				System.out.println("Balance "+bal);
			}
		}
		else if(Objects.equals(ss[0],"E"))
		{
			in.close();	
			break;
		}	
	}
	}
	static Bank bank = new Bank();//creating bank object
}