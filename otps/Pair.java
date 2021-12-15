package otps;
public class Pair //Objects of this class contains pair of otp and mobile number
{
	Pair(int o,int n)
	{
		otp = o;
		num = n;
	}
	//get func
	public int getOTP(){return otp;}
	public int getNum(){return num;}
	//private data
	private int otp,num;
}