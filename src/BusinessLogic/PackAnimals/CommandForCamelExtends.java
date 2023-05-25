package BusinessLogic.PackAnimals;

import Models.Camel;
import View.ConsolePrinter;

public class CommandForCamelExtends<T extends Camel> {
	
	protected <T extends Camel> void workCamel( T animal) throws RuntimeException{
		if (animal.getStockInTheHump() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'stockInTheHump'", new Throwable());
		} else if (animal.getAmountOfSaliva() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'amountOfSaliva'", new Throwable());
		} else if ((animal.getStockInTheHump() - animal.getENERGY_СONSUMPTION()) <= 0) {
			ConsolePrinter.print("Верблюд на последнем издыхании, он чуствует что не переживет данную экскурсию без воды, еды или сна!");
			if ((animal.getAmountOfSaliva() - animal.getSPITTING_VOLUME()) >= 0) {
				animal.spit();
				animal.setAmountOfSaliva(animal.getAmountOfSaliva()-animal.getSPITTING_VOLUME());
			} else {
				ConsolePrinter.print("Верблюд упал от истощения");
			}
		}
		ConsolePrinter.print("And again the camel took an excursion to the oasis!");
		animal.setStockInTheHump(animal.getStockInTheHump() - animal.getENERGY_СONSUMPTION());
	}
}
