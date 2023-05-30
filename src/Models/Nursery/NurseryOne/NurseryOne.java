package Models.Nursery.NurseryOne;

import Models.Abstract.Animals.HumanFriend;

import java.util.HashMap;
import java.util.Map;

public class NurseryOne<T extends HumanFriend> {
	private HashMap<String,HumanFriend> allAnimals;
	
	
	
	
	public NurseryOne() {
		this.allAnimals = new HashMap<>();
	}
	
	public Map<String, HumanFriend> getAllAnimals() {
		return allAnimals;
	}
	
	public void setAllAnimals(HashMap<String, HumanFriend> allAnimals) {
		this.allAnimals = allAnimals;
	}
}
