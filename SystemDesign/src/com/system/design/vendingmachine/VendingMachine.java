package com.system.design.vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* 1: List Items like Water(2),Pepsi(5),Coke(10), Sprite(15), Soda(20)
 * 2: Accepts Coins like 2Rs, 5Rs, 10Rs, 15Rs, 20Rs
 * 3: User should get selected item and return change if any
 * 4: User can cancel order and should be refunded
 * 5: Allows Operator to reset
 * 6: SoldOutException
 * 7: NotFullyPaidException
 * 8: NoChangeException
 * 9: OutofserviceException 
 */
public class VendingMachine implements VendingMachineService {
	
	private Item currentItem;
	private int currentBalance;
	private long totalSales;
	private Inventory<Item> itemInventory = new Inventory<>();
	private Inventory<Coin> cashInventory = new Inventory<>();
	
	public VendingMachine() {
		initializeMachine();
	}
	

	@Override
	public List<Item> listIems() {
		List<Item> items = new ArrayList<>();
		Map<Item, Integer> inventory = itemInventory.getInventory();
		
		return null;
	}

	@Override
	public int selectItem(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertCoin(Coin coin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bucket<Item, List<Coin>> purchase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coin> refund() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	
	private void initializeMachine(){
		
		itemInventory.put(new Item("Water", 2), 5);
		itemInventory.put(new Item("Coke", 5), 5);
		itemInventory.put(new Item("Pepsi", 10), 5);
		itemInventory.put(new Item("Sprite", 15), 5);
		itemInventory.put(new Item("Soda", 20), 5);
		
		cashInventory.put(new Coin("Two", 2), 5);
		cashInventory.put(new Coin("Five", 5), 5);
		cashInventory.put(new Coin("Ten", 10), 5);
		cashInventory.put(new Coin("Twenty", 20), 5);
		
	}


	public Item getCurrentItem() {
		return currentItem;
	}


	public void setCurrentItem(Item currentItem) {
		this.currentItem = currentItem;
	}


	public int getCurrentBalance() {
		return currentBalance;
	}


	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}


	public long getTotalSales() {
		return totalSales;
	}


	public void setTotalSales(long totalSales) {
		this.totalSales = totalSales;
	}


	public Inventory<Item> getItemInventory() {
		return itemInventory;
	}


	public void setItemInventory(Inventory<Item> itemInventory) {
		this.itemInventory = itemInventory;
	}


	public Inventory<Coin> getCashInventory() {
		return cashInventory;
	}


	public void setCashInventory(Inventory<Coin> cashInventory) {
		this.cashInventory = cashInventory;
	}
	
	

}
