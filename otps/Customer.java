package otps;
public class Customer
{
	public Customer(int num)
	{
		no = num;
		id = count;
		count++;
	}
	//get functions
	public int getId()
	{
		return id;
	}
	public int getNum()
	{
		return no;
	}
	//private data
   	private int id;
	private int no;
	private static int count = 1;
}