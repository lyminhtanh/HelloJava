package InheritanceDemo;

import java.util.Random;

public class CastDemo {
	public static Animal getRandomAnimal(){
		int random = new Random().nextInt(2);
		Animal animal = null;
		if(random == 0){
			animal = new Mouse("Tom",5);
		}
		else{
			animal = new Mouse("Jerry", 4);
		}
		return animal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = getRandomAnimal();
		if(animal instanceof Mouse){
			Mouse mouse = (Mouse) animal;
			System.out.println(mouse.getAnimalName()+ "  "+ mouse.getName());
		}
	}

}
