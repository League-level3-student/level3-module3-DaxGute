package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList <Animal> Farm = new <Animal> ArrayList();
		Farm.add(new Dog());
		Farm.add(new Cat());
		Farm.add(new Sheep());
		Farm.add(new Cow());
		Farm.add(new Dog());
		Farm.add(new Dog());
		
		for (int i = 0; i < Farm.size(); i++) {
			Farm.get(i).makeNoise();
			Farm.get(i).Eat();
		}	
		
	}
}
