package com.anysolutions.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<ItemIF> items = new ArrayList<ItemIF>();

	public void addItem(ItemIF item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (ItemIF item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (ItemIF item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
