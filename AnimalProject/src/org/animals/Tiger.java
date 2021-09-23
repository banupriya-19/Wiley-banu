package org.animals;

public class Tiger {

	private String color;
	private int weight,age;
	
    public Tiger(String color, int weight,int age)
	{
		this.color=color;
		this.weight=weight;
		this.age=age;
	}
	
    public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public boolean isVegetarian(boolean answer)
	{
		return answer;
	}
	public boolean canClimb(boolean answer2)
	{
		return answer2;
	}
	public String sound(String sou)
	{
		return sou;
	}
}
