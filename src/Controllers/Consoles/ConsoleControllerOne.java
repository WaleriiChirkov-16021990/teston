package Controllers.Consoles;

import BusinessLogic.Nursery.AddNewAnimal.AddNewAnimal;
import BusinessLogic.Nursery.AddNewAnimal.CreateAnimals.CreateNewAnimal;
import BusinessLogic.Nursery.ShowAllAnimals.ShowAllAnimalsOne;
import BusinessLogic.Nursery.ShowStudiedCommands.SearchAnimal.SearchAnimalOfName;
import BusinessLogic.Nursery.ShowStudiedCommands.SearchAnimal.ShowFinderAnimals;
import BusinessLogic.Nursery.TeacherOfNewCommands.TeacherOfAnimalCommands;
import Models.Abstract.Animals.HumanFriend;
import Models.Nursery.NurseryOne.NurseryOne;
import View.Consoles.ConsolePrinterOne;
import View.UiConsole.UI;

import java.util.Scanner;

public class ConsoleControllerOne {
	private NurseryOne<HumanFriend> nurseryOne;
//	private ReadJsonFileOne<HumanFriend> readJsonFileOne;
	
	public ConsoleControllerOne(NurseryOne<HumanFriend> nurseryOne) {
		this.nurseryOne = nurseryOne;
//		this.readJsonFileOne = readJsonFileOne;
	}
	
	public ConsoleControllerOne() {
		this.nurseryOne = new NurseryOne<>();
//		this.readJsonFileOne = new ReadJsonFileOne<HumanFriend>();
	}
	
	public void runApplication() {
//	readJsonFileOne.readFile();
//	nurseryOne.setAllAnimals(readJsonFileOne.getAllAnimals());
		Scanner scanner = new Scanner(System.in);
		String inputUser = null;
		boolean flag = true;
		while (flag) {
			ConsolePrinterOne.print(UI.firstMenu);
			inputUser = scanner.nextLine().strip();
			if (inputUser.equals("1")) {
				if (nurseryOne.getAllAnimals() == null || nurseryOne.getAllAnimals().isEmpty()) {
					ConsolePrinterOne.print("Ваш питомник пуст!");
				} else {
					new ShowAllAnimalsOne<HumanFriend>(nurseryOne.getAllAnimals());
				}
//				readJsonFileOne.readFile();
//				new ShowAllAnimalsOne<HumanFriend>(readJsonFileOne.getAllAnimals());
			} else if (inputUser.equals("2")) {
				AddNewAnimal<NurseryOne<HumanFriend>> addNewAnimal = new AddNewAnimal<NurseryOne<HumanFriend>>(this.nurseryOne);
			} else if (inputUser.equals("3")) {
				ShowFinderAnimals.show(SearchAnimalOfName.searchOfName(this.nurseryOne));
			} else if (inputUser.equals("4")) {
				TeacherOfAnimalCommands.study(this.nurseryOne);
			} else if (inputUser.equals("5")) {
			
			} else if (inputUser.equals("6")) {
			
			} else if (inputUser.equals("7")) {
				flag = false;
				scanner.close();
			} else {
				ConsolePrinterOne.print("Не известный выбор, всего предусмотрено 7 позиций развития событий.");
			}
		}
	}
	
	public NurseryOne<HumanFriend> getNurseryOne() {
		return nurseryOne;
	}
	
	public void setNurseryOne(NurseryOne<HumanFriend> nurseryOne) {
		this.nurseryOne = nurseryOne;
	}

//	public ReadJsonFileOne<HumanFriend> getReadJsonFileOne() {
//		return readJsonFileOne;
//	}
//
//	public void setReadJsonFileOne(ReadJsonFileOne<HumanFriend> readJsonFileOne) {
//		this.readJsonFileOne = readJsonFileOne;
//	}
}
