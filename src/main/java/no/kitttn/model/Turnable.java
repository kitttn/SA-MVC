package no.kitttn.model;

import rx.Observable;

/**
 * @author kitttn
 */
public interface Turnable {
	double PROBABILITY = 0.2;
	/**
	 * Call to turn on this turnable device
	 * @return true, if turned on successfully, false - if something happened
	 */
	default Observable<Boolean> turnOn() {
		double check = Math.random();
		System.out.println("Turning on: " + check);
		return check < PROBABILITY ? Observable.just(false) : Observable.just(true);
	}

	default void turnOff() {
		
	}
}
