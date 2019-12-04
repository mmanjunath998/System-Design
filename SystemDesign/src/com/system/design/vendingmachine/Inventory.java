package com.system.design.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

	private Map<T, Integer> inventory = new HashMap<>();
	
	
	public void put(T item, int quantity){
		inventory.put(item, quantity);
	}
	public int getQuantity(T item){
		Integer count = inventory.get(item);
		return count == null ? 0 : count;
	}
	
	public boolean hasItem(T item){
		return getQuantity(item) > 0;
	}
	
	public void addItem(T item){
		if(hasItem(item)){
			int count = inventory.get(item);
			inventory.put(item, count+1);
		}else{
			inventory.put(item, 1);
		}
	}
	
	public void deduct(T item){
		if(hasItem(item)){
			int count = inventory.get(item);
			inventory.put(item, count-1);
		}
	}
	public Map<T, Integer> getInventory() {
		return inventory;
	}
}
