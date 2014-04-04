package org.domain;

public class Traveller {

	private Vehicale vehicale;

	public void setVehicale(Vehicale vehicale) {
		this.vehicale = vehicale;
	}

	public void startJourney() {
		vehicale.move();
		System.out.println("Traveller Started Journey\n");

	}

}
