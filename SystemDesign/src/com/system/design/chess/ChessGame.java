package com.system.design.chess;

public class ChessGame {
	private Player[] players = new Player[2];
	private Board board;
	private Player currentPlayer;
	private boolean gameStatus;
	
	public ChessGame(Player p1, Player p2){
		board = new Board(64);
		initialize(p1, p2);
		currentPlayer = p1;
		
	}
	
	private void initialize(Player p1 ,Player p2){
		players[0] = p1;
		players[1] = p2;
		board.initialize();
	}
	
	public boolean playerMove(Player player, int startx, int starty, int endx, int endy){
		
		Box start = board.getBoxes()[startx][starty];
		Box end = board.getBoxes()[endx][endy];
		
		Piece source = start.getPiece();
		if(source.canMove(board, start, end)){
			Piece endPiece = end.getPiece();
			if(endPiece != null){
				endPiece.setKilled(true);
			}
			end.setPiece(source);
			return true;
		}
		
		return false;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public boolean isGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(boolean gameStatus) {
		this.gameStatus = gameStatus;
	}
	
	
}
