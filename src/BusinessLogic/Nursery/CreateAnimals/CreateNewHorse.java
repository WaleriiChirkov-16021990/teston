package BusinessLogic.Nursery.CreateAnimals;

import Models.Animals.PackAnimals.Horse;
import Models.Animals.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateNewHorse {
	private Horse animal;
	
	private int energy = 60;
	private int weight = 20;
	private int liftingWeight = 40;
	private int impactForce = 120;
	private int biteForce = 40;
	
	public CreateNewHorse() {
		this.animal = createHorse();
	}
	
	public Horse getAnimal() {
		return animal;
	}
	
	private Horse createHorse() {
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
		
		System.out.println("введите тяговый вес");
		String liftingW = scanner.next();
		try {
			liftingWeight = Integer.parseInt(liftingW);
		} catch (RuntimeException e) {
			e.fillInStackTrace();
		}
		
//		System.out.println("введите силу удара");
//		String impact = scanner.next();
//		try {
//			impactForce = Integer.parseInt(impact);
//		} catch (RuntimeException e) {
//			e.fillInStackTrace();
//		}
		
//		System.out.println("введите силу укуса");
//		String bite = scanner.next();
//		try {
//			biteForce = Integer.parseInt(bite);
//		} catch (RuntimeException e) {
//			e.fillInStackTrace();
//		}
		return new Horse(name,date2,energy,weight, Type.PackAnimal,liftingWeight,impactForce,biteForce);
	}
}
