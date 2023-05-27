package Models.Animals.PackAnimals;

import BusinessLogic.PackAnimals.CommandForHorseExtends;
import Models.Abstract.Animals.PackAnimal;
import Models.Animals.Type;
import View.ConsolePrinter;

import java.util.Date;
import java.util.Map;

public class Horse extends PackAnimal {
	private int impactForce;
	private int biteForce;
	private Map<String, String> studiedСommands;
	
	private final int ENERGY_СONSUMPTION = 5;
	
	public Horse(int liftingWeight, int impactForce, int biteForce) {
		super(liftingWeight);
		this.impactForce = impactForce;
		this.biteForce = biteForce;
		this.studiedСommands = Map.of("Hit", "Лошадь вас лягнула", "Bite", "Красавица лошадь вас укусила");
	}
	
	public Horse(String name, Date birthDay, int energy, int weight, Type type, int liftingWeight, int impactForce, int biteForce) {
		super(name, birthDay, energy, weight, type, liftingWeight);
		this.impactForce = impactForce;
		this.biteForce = biteForce;
		this.studiedСommands = Map.of("Hit", "Лошадь вас лягнула", "Bite", "Красавица лошадь вас укусила");
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
	
	public int getImpactForce() {
		return impactForce;
	}
	
	public void setImpactForce(int impactForce) {
		this.impactForce = impactForce;
	}
	
	public int getBiteForce() {
		return biteForce;
	}
	
	public void setBiteForce(int biteForce) {
		this.biteForce = biteForce;
	}
	
	@Override
	protected void work() throws RuntimeException  {
		if (impactForce < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'stockInTheHump'", new Throwable());
		} else if (biteForce < 0) {
			throw new RuntimeException("Не инициализирована или имеет не корректтное значение переменная 'amountOfSaliva'", new Throwable());
		} else if ((impactForce - ENERGY_СONSUMPTION) <= 0) {
			ConsolePrinter.print("Лошадь чуствует что не переживет данную работу без воды, еды и сна!");
			if ((biteForce - ENERGY_СONSUMPTION) >= 0) {
				new CommandForHorseExtends<Horse>(this).bite();
				setImpactForce(getBiteForce() - ENERGY_СONSUMPTION);
			} else {
				ConsolePrinter.print("Лошадь упала от истощения");
			}
		} else {
			ConsolePrinter.print("Красавица лошадь вас лягнула.");
			setImpactForce(getImpactForce() - ENERGY_СONSUMPTION);
		}
	}
}
