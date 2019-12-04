package com.system.design.chess;

public class Queen extends Piece {

	public Queen(boolean isWhite){
		super(isWhite);
	}
	
	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(isWhite() && end.getPiece().isWhite()){
			return false;
		}
		
		if(start.getX() == end.getX()){
			return true;
		}
		if(start.getY() == end.getY()){
			return true;
		}
		if(end.getX()-start.getX() == end.getY()-start.getY()){
			return true;
		}
		
		return false;
	}

}
