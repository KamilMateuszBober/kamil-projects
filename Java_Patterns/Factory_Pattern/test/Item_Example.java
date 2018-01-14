package test;

import factory.pattern.item.Item;
import factory.pattern.item.ItemFactory;

public class Item_Example {

	public static void main(String[] args) {
		
		Item item1 = ItemFactory.createItem("paint");

	}

}
