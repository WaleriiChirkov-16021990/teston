package Models.Animals.Pet;

import BusinessLogic.Pet.CommandForCatExtends;
import Models.Abstract.Animals.Pet;
import Models.Animals.Type;
import View.ConsolePrinter;

import java.util.Date;

public class Cat extends Pet {
	private String color;
	
	public Cat(String whoIsHePlayingWith, int loves, String favoriteFood, String favoriteToy, String color) {
		super(whoIsHePlayingWith, loves, favoriteFood, favoriteToy);
		this.color = color;
	}
	
	public Cat(String name, Date birthDay, int energy, int weight, Type type, String whoIsHePlayingWith, int loves, String favoriteFood, String favoriteToy, String color) {
		super(name, birthDay, energy, weight, type, whoIsHePlayingWith, loves, favoriteFood, favoriteToy);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public void toPlay() {
		if (getLoves() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'loves'", new Throwable());
		} else if (getName().equalsIgnoreCase("")) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'name'", new Throwable());
		} else if (getEnergy() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'energy'", new Throwable());
		} else if (getWeight() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'weight'", new Throwable());
		}
		ConsolePrinter.print("Вы довольный играете с котиком");
		setLoves( getLoves() * 2 );
		if (getLoves() >= 100) {
			new CommandForCatExtends<Cat>(this).scratch();
		}
	}
}
