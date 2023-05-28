package BusinessLogic.Nursery.CreateAnimals;

import BusinessLogic.Nursery.CreateAnimals.CreatePackAnimals.CreateNewCamel;
import BusinessLogic.Nursery.CreateAnimals.CreatePackAnimals.CreateNewDonkey;
import BusinessLogic.Nursery.CreateAnimals.CreatePackAnimals.CreateNewHorse;
import BusinessLogic.Nursery.CreateAnimals.CreatePet.CreateNewCat;
import BusinessLogic.Nursery.CreateAnimals.CreatePet.CreateNewDog;
import BusinessLogic.Nursery.CreateAnimals.CreatePet.CreateNewHamster;
import Models.Abstract.Animals.HumanFriend;
import View.Consoles.ConsolePrinterOne;

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
		ConsolePrinterOne.print("Укажите род животного: ");
		String genus = scanner.nextLine();
		
		if (genus.toLowerCase().contains("horse")) {
			humanFriend = new CreateNewHorse().getAnimal();
		} else if (genus.toLowerCase().contains("donkey")) {
			humanFriend = new CreateNewDonkey().getAnimal();
		} else if (genus.toLowerCase().contains("camel")) {
			humanFriend = new CreateNewCamel().getAnimal();
		} else if (genus.toLowerCase().contains("cat")) {
			humanFriend = new CreateNewCat().getAnimal();
		} else if (genus.toLowerCase().contains("dog")) {
			humanFriend = new CreateNewDog().getAnimal();
		} else if (genus.toLowerCase().contains("hamster")) {
			humanFriend = new CreateNewHamster().getAnimal();
		} else {
			ConsolePrinterOne.print("Животное такого рода нам не известно");
		}
	}
}
