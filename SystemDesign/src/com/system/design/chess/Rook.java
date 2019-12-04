package com.system.design.chess;

public class Rook extends Piece {

	public Rook(boolean isWhite){
		super(isWhite);
	}
	
	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(isWhite() && end.getPiece().isWhite()){
			return true;
		}
		
		return start.getX() == end.getX() || start.getY() == end.getY();
	}

}
