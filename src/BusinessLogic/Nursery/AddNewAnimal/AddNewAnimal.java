package BusinessLogic.Nursery.AddNewAnimal;

import BusinessLogic.Nursery.AddNewAnimal.CreateAnimals.CreateNewAnimal;
import Models.Abstract.Animals.HumanFriend;
import Models.Nursery.NurseryOne.NurseryOne;

public class AddNewAnimal <T extends NurseryOne<HumanFriend>> {
	private HumanFriend animal;
	private T nusery;
	
	public AddNewAnimal(T nusery) {
		this.nusery = nusery;
		CreateNewAnimal create = new CreateNewAnimal();
		this.animal = create.getHumanFriend();
		add();
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
