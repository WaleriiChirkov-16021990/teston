package BusinessLogic.Nursery.CreateAnimals;

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
	
	public CreateNewAnimal() {
		createNewAnimal();
	}
	
	public HumanFriend getHumanFriend() {
		return humanFriend;
	}
	
	public void createNewAnimal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Укажите род животного: ");
		String genus = scanner.nextLine();
		
		if (genus.toLowerCase().contains("horse")) {
			humanFriend = new CreateNewHorse().getAnimal();
		} else if (genus.toLowerCase().contains("donkey")) {
			humanFriend = new CreateNewDonkey().getAnimal();
		} else if (genus.toLowerCase().contains("camel")) {
			humanFriend = new CreateNewCamel().getAnimal();
		} else {
			ConsolePrinter.print("Животное такого рода нам не известно");
		}
	}
	
	
}
