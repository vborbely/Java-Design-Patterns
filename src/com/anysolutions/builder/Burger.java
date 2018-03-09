package com.anysolutions.builder;

public abstract class Burger implements ItemIF {
	@Override
	public PackingIF packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
