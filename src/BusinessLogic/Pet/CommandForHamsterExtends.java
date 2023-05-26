package BusinessLogic.Pet;

import Models.Hamster;
import View.ConsolePrinter;

public class CommandForHamsterExtends<T extends Hamster> {
	
	public <T extends Hamster> void run(T animal) throws RuntimeException {
		if (animal.getEnergy() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'stockInTheHump'", new Throwable());
		} else if (animal.getWeight() < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'amountOfSaliva'", new Throwable());
		} else if ((animal.getEnergy() - animal.getENERGY_СONSUMPTION()) <= 0) {
			ConsolePrinter.print("Этот щекастый зожник на последнем издыхании, он чуствует что не переживет данный спринт без воды, еды или сна!");
		} else {
			ConsolePrinter.print("Хомяк снова в гонке!");
			animal.setEnergy(animal.getEnergy() - animal.getENERGY_СONSUMPTION());
			ConsolePrinter.print("Торнадо бежит в своём колесе!");
		}
	}
}
