package Models;

import Models.Abstract.PackAnimal;
import View.ConsolePrinter;

import java.util.Date;

public class Camel extends PackAnimal {
	private int stockInTheHump;
	private int amountOfSaliva;
	private final int ENERGY_СONSUMPTION = 5;
	private final int SPITTING_VOLUME = 5;
	
	public Camel(int liftingWeight, int stockInTheHump, int amountOfSaliva) {
		super(liftingWeight);
		this.stockInTheHump = stockInTheHump;
		this.amountOfSaliva = amountOfSaliva;
	}
	
	public Camel(String name, Date birthDay, int energy, int weight, Type type, int liftingWeight, int stockInTheHump, int amountOfSaliva) {
		super(name, birthDay, energy, weight, type, liftingWeight);
		this.stockInTheHump = stockInTheHump;
		this.amountOfSaliva = amountOfSaliva;
	}
	
	
	public int getENERGY_СONSUMPTION() {
		return ENERGY_СONSUMPTION;
	}
	
	public int getSPITTING_VOLUME() {
		return SPITTING_VOLUME;
	}
	
	public int getStockInTheHump() {
		return stockInTheHump;
	}
	
	public void setStockInTheHump(int stockInTheHump) {
		this.stockInTheHump = stockInTheHump;
	}
	
	public int getAmountOfSaliva() {
		return amountOfSaliva;
	}
	
	public void setAmountOfSaliva(int amountOfSaliva) {
		this.amountOfSaliva = amountOfSaliva;
	}
	
	public void chewThoms() {
		setAmountOfSaliva(getAmountOfSaliva() + SPITTING_VOLUME * 4);
		ConsolePrinter.print("Верблюд тебе благодарен!");
	}
	
	public void spit() {
		ConsolePrinter.print("Вы получили плевок в лицо от этого гордого живого существа!");
	}
	
	@Override
	public void work() throws RuntimeException{
		if (stockInTheHump < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'stockInTheHump'", new Throwable());
		} else if (amountOfSaliva < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'amountOfSaliva'", new Throwable());
		} else if ((stockInTheHump - ENERGY_СONSUMPTION) <= 0) {
			ConsolePrinter.print("Верблюд на последнем издыхании, он чуствует что не переживет данную экскурсию без воды, еды или сна!");
			if ((amountOfSaliva - SPITTING_VOLUME) >= 0) {
				spit();
				setAmountOfSaliva(getAmountOfSaliva()-SPITTING_VOLUME);
			} else {
				ConsolePrinter.print("Верблюд упал от истощения");
			}
		}
		ConsolePrinter.print("And again the camel took an excursion to the oasis!");
		setStockInTheHump(getStockInTheHump() - ENERGY_СONSUMPTION);
	}
}
