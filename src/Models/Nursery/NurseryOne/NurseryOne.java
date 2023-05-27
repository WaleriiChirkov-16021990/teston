package Models.Nursery.NurseryOne;

import Models.Abstract.Animals.HumanFriend;
import Models.Animals.Type;

import java.util.ArrayList;
import java.util.Map;

public class NurseryOne<T extends HumanFriend> {
	private Map<Type,Map<T,ArrayList<T>>> allAnimals;
	
	public NurseryOne(Map<Type,Map<T, ArrayList<T>>> animals) {
		this.allAnimals = animals;
	}
	
	public NurseryOne() {
	}
	
	public Map<Type, Map<T,ArrayList<T>>> getAllAnimals() {
		return allAnimals;
	}
	
	public void setAllAnimals(Map<Type, Map<T,ArrayList<T>>> allAnimals) {
		this.allAnimals = allAnimals;
	}
}
