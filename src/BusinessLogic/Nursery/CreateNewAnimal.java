package BusinessLogic.Nursery;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.PackAnimals.Camel;
import Models.Animals.PackAnimals.Donkey;
import Models.Animals.PackAnimals.Horse;
import Models.Animals.Type;
import View.ConsolePrinter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateNewAnimal {
	private HumanFriend humanFriend;
	
	public void createNewAnimal(Scanner scanner) {
		System.out.println("Укажите род животного: ");
		String genus = scanner.nextLine();
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
		int energy = 60;
		int weight = 0;
		int liftingWeight = 0;
		int impactForce = 0;
		int biteForce = 0;
		
		System.out.println("введите вес");
		String weights = scanner.next();
		try {
			weight = Integer.parseInt(weights);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
		System.out.println("введите тяговый вес");
		String liftingW = scanner.next();
		try {
			liftingWeight = Integer.parseInt(liftingW);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
		System.out.println("введите силу удара");
		String impact = scanner.next();
		try {
			impactForce = Integer.parseInt(impact);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
		System.out.println("введите силу укуса");
		String bite = scanner.next();
		try {
			biteForce = Integer.parseInt(bite);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
		if (genus.toLowerCase().contains("horse")) {
			humanFriend = new Horse(name, date2, energy, weight, Type.PackAnimal, liftingWeight, impactForce, biteForce);
		} else if (genus.toLowerCase().contains("donkey")) {
			humanFriend = new Donkey(name, date2, energy, weight, Type.PackAnimal, liftingWeight, impactForce, biteForce);
		} else if (genus.toLowerCase().contains("camel")) {
			humanFriend = new Camel(name, date2, energy, weight, Type.PackAnimal, liftingWeight, impactForce, biteForce);
		} else {
			ConsolePrinter.print("Животное такого рода нам не известно");
		}
		
	}
}
