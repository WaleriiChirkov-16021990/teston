package BusinessLogic.Nursery;

import Models.Abstract.HumanFriend;
import Models.Nursery;

public class AddNewAnimal <T extends Nursery<HumanFriend>> {
	private HumanFriend animal;
	private T nusery;
	
	public AddNewAnimal(HumanFriend animal, T nusery) {
		this.animal = animal;
		this.nusery = nusery;
	}
	
	public <T> void add() {
		try {
			this.nusery.getAllAnimals().get(this.animal.getType()).get(this.animal.getName()).add(this.animal);
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
