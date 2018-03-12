package com.anysolutions.builder2;

import com.anysolutions.builder2.Car.CarBuilder;

public class BuilderPatternDemo2 {

	public static void main(String[] args) {

		final Car car1 = new Car.CarBuilder().build();
		
		System.out.println(car1);
		
		final Car car2 = new Car.CarBuilder()
				.registrationNumber("ABC-123")
				.transmissionType("automatic")
				.mark("Vaxhaul").build();
		
		System.out.println(car2);
		
		Car car4 = new Car.CarBuilder().gears(3).build();
		car4 = car4.toBuilder().gears(5).build();
		System.out.println(car4);
		
		//Exception
		Car car3 = new Car.CarBuilder().gears(10).build();
		
	}

}
