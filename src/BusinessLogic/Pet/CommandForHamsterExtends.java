package BusinessLogic.Pet;

import Models.Hamster;
import View.ConsolePrinter;

public class CommandForHamsterExtends <T extends Hamster> {
	
	public <T extends Hamster> void run(T animal) {
		if (animal.getEnergy() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'stockInTheHump'", new Throwable());
		} else if (animal.getWeight() < 0) {
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
		ConsolePrinter.print("Торнадо бежит в своём колесе!");
	}
}
