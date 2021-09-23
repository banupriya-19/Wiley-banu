package zoo;

import org.animals.*;

public class VandalurZoo {
	
	public static void main(String args[])
	{

	Deer deer=new Deer("Brown",45,8);
	Giraffe giraffe=new Giraffe("Yellow",105,10);
	Lion lion=new Lion("Blonde",200,15);
	Monkey monkey=new Monkey("Black",25,13);
	Tiger tiger=new Tiger("Black&Red",40,12);
	
    System.out.println("===========DEER===========");
    System.out.println(deer.getColor());
    System.out.println(deer.getWeight());
    System.out.println(deer.getAge());
    System.out.println(deer.isVegetarian(true));
    System.out.println(deer.canClimb(false));
    System.out.println(deer.sound("KRRRRR"));
    
    System.out.println("===========LION===========");
    System.out.println(lion.getColor());
    System.out.println(lion.getWeight());
    System.out.println(lion.getAge());
    System.out.println(lion.isVegetarian(false));
    System.out.println(lion.canClimb(true));
    System.out.println(lion.sound("ROARRRRR"));
    
    System.out.println("===========GIRAFFE===========");
    System.out.println(giraffe.getColor());
    System.out.println(giraffe.getWeight());
    System.out.println(giraffe.getAge());
    System.out.println(giraffe.isVegetarian(true));
    System.out.println(giraffe.canClimb(false));
    System.out.println(giraffe.sound("ERRRRR"));
    
    System.out.println("===========MONKEY===========");
    System.out.println(monkey.getColor());
    System.out.println(monkey.getWeight());
    System.out.println(monkey.getAge());
    System.out.println(monkey.isVegetarian(true));
    System.out.println(monkey.canClimb(true));
    System.out.println(monkey.sound("DRRRRR"));
    
    System.out.println("===========TIGER===========");
    System.out.println(tiger.getColor());
    System.out.println(tiger.getWeight());
    System.out.println(tiger.getAge());
    System.out.println(tiger.isVegetarian(false));
    System.out.println(tiger.canClimb(true));
    System.out.println(tiger.sound("KooooR"));
  
	}
}
