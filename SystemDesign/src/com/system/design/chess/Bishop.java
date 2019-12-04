
package com.system.design.chess;

public class Bishop extends Piece {

	public Bishop(boolean isWhite){
		super(isWhite);
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
	
		if(isWhite() && end.getPiece().isWhite()){
			return false;
		}
		
		int x = Math.abs(start.getX()-end.getX());
		int y = Math.abs(start.getY()-end.getY());
		
		return x == y;
	}

}

