package BusinessLogic.PackAnimals;

import Models.Camel;
import View.ConsolePrinter;

public class CommandForCamelExtends<T extends Camel> {
	
	protected <T extends Camel> void workCamel(T animal) throws RuntimeException {
		animal.work();
	}
	
	protected <T extends Camel> void spit(T animal) {
		if (animal.getAmountOfSaliva() - animal.getSPITTING_VOLUME() >= 0) {
			ConsolePrinter.print("Верблюд плюнул вам на лицо");
		} else {
			ConsolePrinter.print("Верблюд упал потеряв сознание от обезвоживания, ему нужен покой");
		}
	}
	
	protected <T extends Camel> void chewThrons(T animals) {
	
	}
}
