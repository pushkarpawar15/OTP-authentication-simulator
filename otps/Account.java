package otps;
public class Account
{
	public Account(int id,int b)
	{
		bal = b;
		cus_id = id;
		acc_id = count;
		count++;
	}
	//get functions
	public int getCusId(){return cus_id;}
	public int getBal(){return bal;}
	public int getId(){return acc_id;}
	//private data
	private int cus_id;
	private int acc_id;
	private int bal;
	private static int count = 101;
}