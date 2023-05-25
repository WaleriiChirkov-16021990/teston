package Models.Abstract;

import Models.Type;

import java.util.Date;

public abstract class PackAnimal extends HumanFriend{
	private int liftingWeight;
	
	
	
	public PackAnimal(int liftingWeight) {
		this.liftingWeight = liftingWeight;
	}
	
	public PackAnimal(String name, Date birthDay, int energy, int weight, Type type, int liftingWeight) {
		super(name, birthDay, energy, weight, type);
		this.liftingWeight = liftingWeight;
	}
	
	public int getLiftingWeight() {
		return liftingWeight;
	}
	
	public void setLiftingWeight(int liftingWeight) {
		this.liftingWeight = liftingWeight;
	}
	
	protected abstract void work();
}
