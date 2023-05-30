package BusinessLogic.Nursery.TeacherOfNewCommands;

import Models.Abstract.Animals.HumanFriend;
import Models.Nursery.NurseryOne.NurseryOne;
import View.Consoles.ConsolePrinterOne;

import java.util.Scanner;

public class TeacherOfAnimalCommands {
	public static void study(NurseryOne<HumanFriend> nurseryOne) {
		Scanner scanner = new Scanner(System.in);
		ConsolePrinterOne.print("Введите уникальный ключ животного для его обучения");
		String uInput = scanner.nextLine().strip();
		HumanFriend humanFriend = SelectAnimalOfTheKey.selectAnimal(uInput, nurseryOne);
		if (humanFriend != null) {
			ConsolePrinterOne.print("Введите новую команду: ");
			String command = scanner.nextLine();
			ConsolePrinterOne.print("Укажите что должно делать животное (коротко): ");
			String action = scanner.nextLine();
			humanFriend.getStudiedСommands().put(command, action + "!");
		} else {
			ConsolePrinterOne.print("Такого животного пока нет =(");
		}
		
	}
}
