package main;
import java.util.ArrayList;
import otps.*;
public class Bank
{
	public Bank(){}
	public int addCustomer(int num) //creates customer object and adds it to customer list
	{
		Customer c = new Customer(num);
		customers.add(c);
		return c.getId();
	}
	public int addAccount(int id,int bal) //creates account object and adds it account list
	{
		Account a = new Account(id,bal);
		accounts.add(a);
		return a.getId();
	}
	public void sendOTPforBalanceCheck(int acc_num) //verify otp function
	{
		int i=0;
		for(;i<accounts.size();i++)
		{
			if(accounts.get(i).getId()==acc_num)
			{
				break;
			}
		}
		int j=0;
		for(;j<customers.size();j++)
		{
			if(customers.get(j).getId()==accounts.get(i).getCusId())
			break;
		}
		//above two for loops are used to get mobile num form account num.
		OTPService s = new OTPService(customers.get(j).getNum()); // creating OTPService object
		s.sendOTP(customers.get(j).getNum());
		otps.add(s); // adding OTPService object to list
	}
	public int verifyOTPandGetBalance(int acc_num,int otp)
	{
		int i=0;
		for(;i<accounts.size();i++)
		{
			if(accounts.get(i).getId()==acc_num)
			{
				break;
			}
		}
		int j=0;
		for(;j<customers.size();j++)
		{
			if(customers.get(j).getId()==accounts.get(i).getCusId())
			break;
		}
		//above two for loops are used to get mobile num form account num.
		int num = customers.get(j).getNum();
		if(OTPService.verifyOTP(num,otp)) //verifies otp
		{
			for(i=0;i<accounts.size();i++)
			{
				if(accounts.get(i).getId()==acc_num) //find acccount from account number and returns balance
				{
					return accounts.get(i).getBal();
				}
			}
		}
		return 0; 
	}
	//private data
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private ArrayList<OTPService> otps = new ArrayList<OTPService>();
}