package BusinessLogic.Nursery.ShowAllAnimals;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Type;
import View.Consoles.ConsolePrinterOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShowAllAnimalsOne<T extends HumanFriend> {
	private HashMap<String,HumanFriend> allAnimals;
	
	public ShowAllAnimalsOne(HashMap<String, HumanFriend> allAnimals) {
		this.allAnimals = allAnimals;
		showAll();
	}
	
	public void showAll() {
		ConsolePrinterOne.print("\n");
		for (String animal:
		     this.allAnimals.keySet()) {
			ConsolePrinterOne.print(animal + " :");
			ConsolePrinterOne.print((allAnimals.get(animal).toString()));
		}
	}
	
	public HashMap<String, HumanFriend> getAllAnimals() {
		return allAnimals;
	}
	
	public void setAllAnimals(HashMap<String, HumanFriend> allAnimals) {
		this.allAnimals = allAnimals;
	}
}
