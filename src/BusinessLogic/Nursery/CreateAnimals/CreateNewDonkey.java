package BusinessLogic.Nursery.CreateAnimals;

import Models.Animals.PackAnimals.Donkey;
import Models.Animals.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateNewDonkey {
	
	private Donkey animal;
	
	private int energy = 40;
	private int weight = 12;
	private int liftingWeight = 10;
	private int stubbornness = 25;
	
	public CreateNewDonkey() {
		this.animal = createDonkey();
	}
	
	public Donkey getAnimal() {
		return animal;
	}
	
	private Donkey createDonkey() {
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
		return new Donkey(name,date2,energy,weight, Type.PackAnimal,liftingWeight,stubbornness);
	}
	
}
