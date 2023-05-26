package Models;

import Models.Abstract.HumanFriend;

import java.util.ArrayList;
import java.util.Map;

public class Nursery <T extends HumanFriend> {
	private Map<Type,Map<T,ArrayList<T>>> allAnimals;
	
	public Nursery(Map<Type,Map<T, ArrayList<T>>> animals) {
		this.allAnimals = animals;
	}
	
	public Nursery() {
	}
	
	public Map<Type, Map<T,ArrayList<T>>> getAllAnimals() {
		return allAnimals;
	}
	
	public void setAllAnimals(Map<Type, Map<T,ArrayList<T>>> allAnimals) {
		this.allAnimals = allAnimals;
	}
}
