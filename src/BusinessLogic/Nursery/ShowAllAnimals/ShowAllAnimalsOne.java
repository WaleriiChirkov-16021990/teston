package BusinessLogic.Nursery.ShowAllAnimals;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Type;
import View.Consoles.ConsolePrinterOne;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class ShowAllAnimalsOne<T extends HumanFriend> {
	private Map<Type, Map<T, ArrayList<T>>> allAnimals;
	
	public ShowAllAnimalsOne(Map<Type, Map<T, ArrayList<T>>> allAnimals) {
		this.allAnimals = allAnimals;
		showAll();
	}
	
	public void showAll() {
		for (Type allTypes :
				Type.values()) {
			Set<HumanFriend> animals = (Set<HumanFriend>) allAnimals.get(allTypes.toString()).keySet();
			for (int i = 0; i < animals.size(); i++) {
				System.out.println(getAllAnimals().get(allTypes.toString()).get(animals.toArray()[i]));
				System.out.println();
			}
		}
	}
	
	public Map<Type, Map<T, ArrayList<T>>> getAllAnimals() {
		return allAnimals;
	}
	
	public void setAllAnimals(Map<Type, Map<T, ArrayList<T>>> allAnimals) {
		this.allAnimals = allAnimals;
	}
}
