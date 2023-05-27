package Models;

import Models.Abstract.PackAnimal;
import View.ConsolePrinter;

import java.util.Date;
import java.util.Map;

public class Donkey extends PackAnimal {
	
	private int stubbornness;
	private final int ENERGY_СONSUMPTION = 5;
	private Map<String, String> studiedСommands;
	
	
	public Donkey(int liftingWeight) {
		super(liftingWeight);
		this.studiedСommands = Map.of("Walk", "Ослик идет восполнять силы!");
	}
	
	public Donkey(String name, Date birthDay, int energy, int weight, Type type, int liftingWeight) {
		super(name, birthDay, energy, weight, type, liftingWeight);
		this.studiedСommands = Map.of("Walk", "Ослик идет восполнять силы!");
	}
	
	public Map<String, String> getStudiedСommands() {
		return studiedСommands;
	}
	
	public void setStudiedСommands(Map<String, String> studiedСommands) {
		this.studiedСommands = studiedСommands;
	}
	
	public int getENERGY_СONSUMPTION() {
		return ENERGY_СONSUMPTION;
	}
	
	public int getStubbornness() {
		return stubbornness;
	}
	
	public void setStubbornness(int stubbornness) {
		this.stubbornness = stubbornness;
	}
	
	@Override
	protected void work() throws RuntimeException {
		if (getStubbornness() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'stubbornness'", new Throwable());
		} else if (getLiftingWeight() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'liftWeight'", new Throwable());
		} else if (getEnergy() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'energy'", new Throwable());
		} else if (getWeight() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'weight'", new Throwable());
		} else if (getStubbornness() > 100) {
			ConsolePrinter.print("Ослик уже настолько упрям что не пойдет никуда!");
		} else {
			ConsolePrinter.print("Счастливый ослик идет гулять");
			setStubbornness(getStubbornness() - getENERGY_СONSUMPTION());
			if (getStubbornness() < 0) setStubbornness(0);
		}
	}
}
