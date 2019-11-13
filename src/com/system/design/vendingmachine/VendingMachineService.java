package com.system.design.vendingmachine;

import java.util.List;

public interface VendingMachineService {
	
	public List<Item> listIems();
	
	public int selectItem(Item item);
	
	public void insertCoin(Coin coin);
	
	public Bucket<Item, List<Coin>> purchase();
	
	public List<Coin> refund();
	
	public void reset();
}
