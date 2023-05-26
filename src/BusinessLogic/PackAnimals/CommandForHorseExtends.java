package BusinessLogic.PackAnimals;

import Models.Horse;
import View.ConsolePrinter;

public class CommandForHorseExtends <T extends Horse> {
	private T animal;
	
	public CommandForHorseExtends(T animal) {
		this.animal = animal;
	}
	
	public CommandForHorseExtends() {
	}
	
	public T getAnimal() {
		return animal;
	}
	
	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	public void bite() throws RuntimeException{
		if (animal.getBiteForce() < 0) {
			throw new RuntimeException("Ошибка параметра biteForce", new Throwable());
		}
		if (animal.getBiteForce() - animal.getENERGY_СONSUMPTION() >= 0) {
			ConsolePrinter.print("Лошадь вас укусила");
			animal.setBiteForce(animal.getBiteForce() - animal.getENERGY_СONSUMPTION());
		} else {
			ConsolePrinter.print("У лошади нет сил даже на укус =(");
		}
	}
}
