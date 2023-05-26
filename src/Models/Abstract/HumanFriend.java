package Models.Abstract;

import Models.Type;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public abstract class HumanFriend {
	protected static int countAnimals = 0;
	private String name;
	private Date birthDay;
	private int energy;
	private int weight;
	private Type type;
	
	public HumanFriend() {
		countAnimals += 1;
	}
	
	public HumanFriend(String name, Date birthDay, int energy, int weight, Type type) {
		this.name = name;
		this.birthDay = birthDay;
		this.energy = energy;
		this.weight = weight;
		this.type = type;
		countAnimals +=1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "HumanFriend{" +
				"name='" + name + '\'' +
				", birthDay=" + birthDay +
				", energy=" + energy +
				", weight=" + weight +
				", type=" + type +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof HumanFriend that)) return false;
		return energy == that.energy && weight == that.weight && Objects.equals(name, that.name) && Objects.equals(birthDay, that.birthDay) && type == that.type;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, birthDay, energy, weight, type);
	}
	
	
}
