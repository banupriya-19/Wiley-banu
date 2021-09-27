package vcom.banu;


public class InheritedWorker extends Worker
{

	public InheritedWorker(String name, int salaryRate)
	{
		super(name, salaryRate);
	}
	public int pay(int hours)
	{
		int amount=hours*salaryRate;
		return amount;
	}

}