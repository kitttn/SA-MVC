package no.kitttn;

import java.util.Scanner;

import no.kitttn.view.TableLampView;

/**
 * @author kitttn
 */
public class Runner {
	public static void main(String[] args) {
		new Runner().run();
	}

	public void run() {
		TableLampView view = new TableLampView();
		String res = "";
		while (!res.equals("exit")) {
			System.out.println("Runner: Type \"exit\" to exit app, \"on\" to turn light on, \"off\" to turn light off.");
			Scanner sc = new Scanner(System.in);
			res = sc.nextLine();
			switch (res) {
				case "on":
					view.turnLightOn();
					break;
				case "off":
					view.turnLightOff();
			}
		}
	}
}
