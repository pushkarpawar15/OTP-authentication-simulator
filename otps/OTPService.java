package otps;
import java.util.ArrayList;
public class OTPService
{
	public OTPService(int mob_num) 
	{
		otp = count++;
		Pair p =  new Pair(otp,mob_num);
		for(int i=0;i<pairs.size();i++) //for loop to remove old otps for same mobile number
		{
			if(pairs.get(i).getNum()==p.getNum())
			{
				pairs.remove(i);
			}
		}
		pairs.add(p);
	}
	public void  sendOTP(int num)
	{
		System.out.println("OTP "+otp+" to "+num);
	}
	static public boolean verifyOTP(int num,int otp) //this method check if otp is present corresponding to mobile number (Static because used for whole class not for particular object)
	{
		for(int i=0;i<pairs.size();i++)
		{
			if(pairs.get(i).getOTP() == otp && pairs.get(i).getNum()==num)
			{
				pairs.remove(i);
				return true;
			}
		}
		return false;
	}
	//private data
	private int otp;
	private static int count = 1001;
	private static ArrayList<Pair> pairs = new ArrayList<Pair>();
}