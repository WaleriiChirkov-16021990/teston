package BusinessLogic.Nursery.CreateAnimals.CreatePackAnimals;

import BusinessLogic.Nursery.Counter;
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
		String name;
		Date date2 = null;
		String weights;
		String liftingW;
		try (Counter counter = new Counter()) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Укажите имя: ");
			name = scanner.nextLine();
			System.out.println("Введите дату рождения: dd-mm-yyyy ");
			String date = scanner.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			date2 = null;
			try {
				//Parsing the String
				date2 = dateFormat.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("введите вес");
			weights = scanner.next();
			try {
				weight = Integer.parseInt(weights);
			} catch (RuntimeException e) {
				e.fillInStackTrace();
			}
			
			System.out.println("введите тяговый вес");
			liftingW = scanner.next();
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
			if (name == null || weight == 0 || liftingWeight == 0) {
				throw new Exception("неправильная инициализация лошади");
			} else {
				counter.add();
			}
			return new Horse("Horse" + Counter.getCountAnimals(), name, date2, energy, weight, Type.PackAnimal, liftingWeight, impactForce, biteForce);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
