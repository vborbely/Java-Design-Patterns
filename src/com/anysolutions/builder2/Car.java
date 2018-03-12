package com.anysolutions.builder2;

public class Car {
	private final String mark;
	private final String registrationNumber;
	private final int gears;
	private final String transmissionType;

	private Car(final CarBuilder builder) {
		this.mark = builder.mark;
		this.registrationNumber = builder.registrationNumber;
		this.gears = builder.gears;
		this.transmissionType = builder.transmissionType;
	}
	
	public CarBuilder toBuilder() {
		CarBuilder carBuilder = new CarBuilder();
		carBuilder.gears = this.gears;
		carBuilder.registrationNumber = this.registrationNumber;
		carBuilder.mark = this.mark;
		carBuilder.transmissionType = this.transmissionType;
		
		return carBuilder;
	}
	
	
	public String getMark() {
		return mark;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public int getGears() {
		return gears;
	}
	

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", registrationNumber=" + registrationNumber + ", gears=" + gears
				+ ", transmissionType=" + transmissionType + "]";
	}

	public String getTransmissionType() {
		return transmissionType;
	}
	
	
	public static class CarBuilder {
		private String mark;
		private String registrationNumber;
		private int gears;
		private String transmissionType;
		
		public CarBuilder mark(final String mark) {
			this.mark = mark;
			return this;
		}
		
		public CarBuilder registrationNumber(final String registrationNumber) {
			this.registrationNumber = registrationNumber;
			return this;
		}
		
		public CarBuilder gears(final int gears) {
			this.gears = gears;
			return this;
		}
		
		public CarBuilder transmissionType(final String transmissionType) {
			this.transmissionType = transmissionType;
			return this;
		}
		
		public Car build() {
			final Car car = new Car(this);
			
			if(car.gears > 8) {
				throw new IllegalStateException("Too many gears set. Value should be below 8.");
			}
			return car;
		}
		
		
		
	}
	
	

}
