package com.system.design.chess;

public class Board {

	private Box[][] boxes;
	private int size;
	
	public Board(int size){
		this.size = size;
		boxes = new Box[size][size];
	}
	public Box[][] getBoxes() {
		return boxes;
	}
	public void setBoxes(Box[][] boxes) {
		this.boxes = boxes;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public void initialize(){
		
	}
}
