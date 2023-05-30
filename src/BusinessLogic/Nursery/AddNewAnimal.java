package BusinessLogic.Nursery;

import Models.Abstract.Animals.HumanFriend;
import Models.Nursery.NurseryOne.NurseryOne;

public class AddNewAnimal <T extends NurseryOne<HumanFriend>> {
	private HumanFriend animal;
	private T nusery;
	
	public AddNewAnimal(HumanFriend animal, T nusery) {
		this.animal = animal;
		this.nusery = nusery;
	}
	
	public void add() throws RuntimeException {
		try {
			this.nusery.getAllAnimals().put(animal.getKey() ,animal);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public HumanFriend getAnimal() {
		return animal;
	}
	
	public void setAnimal(HumanFriend animal) {
		this.animal = animal;
	}
	
	public T getNusery() {
		return nusery;
	}
	
	public void setNusery(T nusery) {
		this.nusery = nusery;
	}
}
