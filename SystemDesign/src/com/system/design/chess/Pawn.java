package com.system.design.chess;

public class Pawn extends Piece {

	public Pawn(boolean isWhite){
		super(isWhite);
	}
	
	@Override
	public boolean canMove(Board board, Box start, Box end) {
	
		if(this.isWhite() && end.getPiece().isWhite()){
			return false;
		}
		int x = Math.abs(start.getX()- end.getX());
		int y = Math.abs(start.getY()-end.getY());
		return x+y == 1;
	}

}
