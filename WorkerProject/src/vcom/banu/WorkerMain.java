package vcom.banu;


public class WorkerMain
{
	public static void main(String[] args) {
		Worker dailyWorker=new DailyWorker("Madhu", 1000);
		System.out.println("Daily Worker details");
		System.out.println("Name: "+dailyWorker.getName()+"\nSalary: "+dailyWorker.pay(35));
		Worker inheritedWorker=new InheritedWorker("Banu", 10000);
		System.out.println("Inherited Worker details");
		System.out.println("Name: "+inheritedWorker.getName()+"\nSalary: "+inheritedWorker.pay(35));
	}

}