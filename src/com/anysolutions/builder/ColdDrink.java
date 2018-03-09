package com.anysolutions.builder;

public abstract class ColdDrink implements ItemIF {
	@Override
	public PackingIF packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
