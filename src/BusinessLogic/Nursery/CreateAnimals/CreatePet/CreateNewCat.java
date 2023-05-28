package BusinessLogic.Nursery.CreateAnimals.CreatePet;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Pet.Cat;
import Models.Animals.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateNewCat {
	private HumanFriend animal;
	private int energy = 40;
	private int weight = 4;
	private int loves = 75;
	
	
	public CreateNewCat() {
		this.animal = createCat();
	}
	
	public HumanFriend getAnimal() {
		return animal;
	}
	
	private Cat createCat() {
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
		
		
		return new Cat(name, date2, energy, weight, Type.Pet, whoIsHePlayingWith, loves, favoriteFood, favoriteToy, color);
	}
}
