package BusinessLogic.Nursery.CreateAnimals.CreatePet;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Pet.Dog;
import Models.Animals.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateNewDog {
	private HumanFriend animal;
	private int energy = 77;
	private int weight = 40;
	private int loves = 60;
	private int intelligence = 60;
	
	public CreateNewDog() {
		this.animal = createDog();
	}
	
	public HumanFriend getAnimal() {
		return animal;
	}
	
	private Dog createDog() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Укажите имя: ");
		String name = scanner.nextLine();
		System.out.println("Введите дату рождения: dd-mm-yyyy ");
		String date = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2 = null;
		try {
			//Parsing the String
			date2 = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("введите вес");
		String weights = scanner.next();
		try {
			weight = Integer.parseInt(weights);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
		System.out.println("введите цвет животного");
		String color = scanner.next();
		
		System.out.println("введите любимое блюдо животного");
		String favoriteFood = scanner.next();
		
		System.out.println("введите любимую игрушку животного");
		String favoriteToy = scanner.next();
		
		
		System.out.println("Введите имя с кем любит играть кот? ");
		String whoIsHePlayingWith = scanner.next();
		
		System.out.println("Введите насколько вы сильно любите это животное? 0-100");
		String love = scanner.next();
		try {
			loves = Integer.parseInt(love);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
		System.out.println("Введите интелект это животного? 0-100");
		String intellect = scanner.next();
		try {
			intelligence = Integer.parseInt(intellect);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		return new Dog(name, date2, energy, weight, Type.Pet, whoIsHePlayingWith, loves, favoriteFood, favoriteToy, intelligence);
	}
}
