package no.kitttn.model;

import rx.Observable;

/**
 * @author kitttn
 */
public class TableLamp implements Turnable {
	private Light light = new Light();
	private Switch sw = new Switch();

	private boolean isTurnedOn = false;

	public Observable<Boolean> turnOn() {
		if (isTurnedOn) {
			System.out.println("TableLamp: Lamp is already turned on!");
			return Observable.just(true);
		}

		System.out.println("TableLamp: Turning on...");
		return Observable
				.zip(light.turnOn(), sw.turnOn(), (b1, b2) -> {
					isTurnedOn = b1 && b2;
					return isTurnedOn;
				});
	}

	public void turnOff() {
		if (!isTurnedOn) {
			System.out.println("TableLamp: Can't turn off something, which isn't turned on :)");
			return;
		}
		isTurnedOn = false;
		light.turnOff();
		sw.turnOff();
	}
}
