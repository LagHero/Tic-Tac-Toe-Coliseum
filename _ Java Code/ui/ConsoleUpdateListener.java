package ui;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import game.MainBoard;
import game.MainBoard.SubBoard;
import game.Move;
import game.StandardBoard.Position;
import player.Player;

public class ConsoleUpdateListener implements UIListener{

	String LINE1 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE2 = "--+-+-- | --+-+-- | --+-+--";
	String LINE3 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE4 = "--+-+-- | --+-+-- | --+-+--";
	String LINE5 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE6 = "========+=========+========";
	String LINE7 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE8 = "--+-+-- | --+-+-- | --+-+--";
	String LINE9 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE10 = "--+-+-- | --+-+-- | --+-+--";
	String LINE11 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE12 = "========+=========+========";
	String LINE13 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE14 = "--+-+-- | --+-+-- | --+-+--";
	String LINE15 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	String LINE16 = "--+-+-- | --+-+-- | --+-+--";
	String LINE17 = " %s|%s|%s  |  %s|%s|%s  |  %s|%s|%s ";
	
	String screenBreak = String.format("%n%n%n%n%n%n%n%n%n%n");

	@Override
	public void playerMoved(Player player, Move move, MainBoard board) {
		System.out.println(screenBreak);
		System.out.println(String.format("Player '%s' moved to position: %s", player.getName(), move.toString()));
		char[][] boardOwners = getBoardLayout(board);

		System.out.println(String.format(LINE1, boardOwners[0][0], boardOwners[0][1], boardOwners[0][2], boardOwners[1][0], boardOwners[1][1], boardOwners[1][2], boardOwners[2][0], boardOwners[2][1], boardOwners[2][2]));
		System.out.println(LINE2);
		System.out.println(String.format(LINE3, boardOwners[0][3], boardOwners[0][4], boardOwners[0][5], boardOwners[1][3], boardOwners[1][4], boardOwners[1][5], boardOwners[2][3], boardOwners[2][4], boardOwners[2][5]));
		System.out.println(LINE4);
		System.out.println(String.format(LINE5, boardOwners[0][6], boardOwners[0][7], boardOwners[0][8], boardOwners[1][6], boardOwners[1][7], boardOwners[1][8], boardOwners[2][6], boardOwners[2][7], boardOwners[2][8]));
		System.out.println(LINE6);
		System.out.println(String.format(LINE7, boardOwners[3][0], boardOwners[3][1], boardOwners[3][2], boardOwners[4][0], boardOwners[4][1], boardOwners[4][2], boardOwners[5][0], boardOwners[5][1], boardOwners[5][2]));
		System.out.println(LINE8);
		System.out.println(String.format(LINE9, boardOwners[3][3], boardOwners[3][4], boardOwners[3][5], boardOwners[4][3], boardOwners[4][4], boardOwners[4][5], boardOwners[5][3], boardOwners[5][4], boardOwners[5][5]));
		System.out.println(LINE10);
		System.out.println(String.format(LINE11, boardOwners[3][6], boardOwners[3][7], boardOwners[3][8], boardOwners[4][6], boardOwners[4][7], boardOwners[4][8], boardOwners[5][6], boardOwners[5][7], boardOwners[5][8]));
		System.out.println(LINE12);
		System.out.println(String.format(LINE13, boardOwners[6][0], boardOwners[6][1], boardOwners[6][2], boardOwners[7][0], boardOwners[7][1], boardOwners[7][2], boardOwners[8][0], boardOwners[8][1], boardOwners[8][2]));
		System.out.println(LINE14);
		System.out.println(String.format(LINE15, boardOwners[6][3], boardOwners[6][4], boardOwners[6][5], boardOwners[7][3], boardOwners[7][4], boardOwners[7][5], boardOwners[8][3], boardOwners[8][4], boardOwners[8][5]));
		System.out.println(LINE16);
		System.out.println(String.format(LINE17, boardOwners[6][6], boardOwners[6][7], boardOwners[6][8], boardOwners[7][6], boardOwners[7][7], boardOwners[7][8], boardOwners[8][6], boardOwners[8][7], boardOwners[8][8]));

		waitForUser();
	}

	@Override
	public void GameOver(MainBoard board) {
		Player winner = board.getWinner(); 
		
		System.out.println(screenBreak);
		if(winner != null){
		System.out.println(String.format("Player '%s' won!", winner.getName()));
		}else{
			System.out.println("Cat game!");
		}
		char[][] boardOwners = getBoardLayout(board);

		System.out.println(String.format(LINE1, boardOwners[0][0], boardOwners[0][1], boardOwners[0][2], boardOwners[1][0], boardOwners[1][1], boardOwners[1][2], boardOwners[2][0], boardOwners[2][1], boardOwners[2][2]));
		System.out.println(LINE2);
		System.out.println(String.format(LINE3, boardOwners[0][3], boardOwners[0][4], boardOwners[0][5], boardOwners[1][3], boardOwners[1][4], boardOwners[1][5], boardOwners[2][3], boardOwners[2][4], boardOwners[2][5]));
		System.out.println(LINE4);
		System.out.println(String.format(LINE5, boardOwners[0][6], boardOwners[0][7], boardOwners[0][8], boardOwners[1][6], boardOwners[1][7], boardOwners[1][8], boardOwners[2][6], boardOwners[2][7], boardOwners[2][8]));
		System.out.println(LINE6);
		System.out.println(String.format(LINE7, boardOwners[3][0], boardOwners[3][1], boardOwners[3][2], boardOwners[4][0], boardOwners[4][1], boardOwners[4][2], boardOwners[5][0], boardOwners[5][1], boardOwners[5][2]));
		System.out.println(LINE8);
		System.out.println(String.format(LINE9, boardOwners[3][3], boardOwners[3][4], boardOwners[3][5], boardOwners[4][3], boardOwners[4][4], boardOwners[4][5], boardOwners[5][3], boardOwners[5][4], boardOwners[5][5]));
		System.out.println(LINE10);
		System.out.println(String.format(LINE11, boardOwners[3][6], boardOwners[3][7], boardOwners[3][8], boardOwners[4][6], boardOwners[4][7], boardOwners[4][8], boardOwners[5][6], boardOwners[5][7], boardOwners[5][8]));
		System.out.println(LINE12);
		System.out.println(String.format(LINE13, boardOwners[6][0], boardOwners[6][1], boardOwners[6][2], boardOwners[7][0], boardOwners[7][1], boardOwners[7][2], boardOwners[8][0], boardOwners[8][1], boardOwners[8][2]));
		System.out.println(LINE14);
		System.out.println(String.format(LINE15, boardOwners[6][3], boardOwners[6][4], boardOwners[6][5], boardOwners[7][3], boardOwners[7][4], boardOwners[7][5], boardOwners[8][3], boardOwners[8][4], boardOwners[8][5]));
		System.out.println(LINE16);
		System.out.println(String.format(LINE17, boardOwners[6][6], boardOwners[6][7], boardOwners[6][8], boardOwners[7][6], boardOwners[7][7], boardOwners[7][8], boardOwners[8][6], boardOwners[8][7], boardOwners[8][8]));

		System.out.println();
	}

	private char[][] getBoardLayout(MainBoard board){
		char[][] table = new char[9][9];
		
		table[0] = makeSubBoard(board, SubBoard.NORTH_WEST);
		table[1] = makeSubBoard(board, SubBoard.NORTH);
		table[2] = makeSubBoard(board, SubBoard.NORTH_EAST);
		table[3] = makeSubBoard(board, SubBoard.WEST);
		table[4] = makeSubBoard(board, SubBoard.CENTRAL);
		table[5] = makeSubBoard(board, SubBoard.EAST);
		table[6] = makeSubBoard(board, SubBoard.SOUTH_WEST);
		table[7] = makeSubBoard(board, SubBoard.SOUTH);
		table[8] = makeSubBoard(board, SubBoard.SOUTH_EAST);
		return table;
	}
		
		
		private char[] makeSubBoard(MainBoard board, SubBoard subBoard){
			char[] subBoardTable;
			if(board.getSubBoard(subBoard).isGameOver()){
				if(board.getSubBoard(subBoard).getWinner() == null){
					subBoardTable = new  char[]{'\\','|','/','C','A','T','/','|','\\'};
				}else{
					subBoardTable = new  char[]{'\\','|','/','-',board.getSubBoard(subBoard).getWinner().getSymbol(),'-','/','|','\\'};
				}
			}else{
				subBoardTable = new  char[]{
						bold(board, subBoard, Position.NORTH_WEST),
						bold(board, subBoard, Position.NORTH),
						bold(board, subBoard, Position.NORTH_EAST),
						bold(board, subBoard, Position.WEST),
						bold(board, subBoard, Position.CENTRAL),
						bold(board, subBoard, Position.EAST),
						bold(board, subBoard, Position.SOUTH_WEST),
						bold(board, subBoard, Position.SOUTH),
						bold(board, subBoard, Position.SOUTH_EAST)
				};
			}
			return subBoardTable;
		}

	private char bold(MainBoard board, SubBoard subBoard, Position position) {
		Player owner = board.getSubBoard(subBoard).getPositionOwner(position);
		if(owner == null){
			return ' ';
		}
		return owner.getSymbol();
	}

	@Override
	public void newGame(List<Player> players) {
		System.out.println(screenBreak);
		System.out.println("New game between these players:");
		int index = 1;
		for(Player player : players){
			System.out.println(String.format("\tPlayer %d: %s", index++, player.getName()));
		}
		
		waitForUser();
	}

	private void waitForUser() {
		System.out.println("Press 'Enter' to continue...");
		try {
			System.in.read(); //Waits until the user enters data...
			System.in.skip(1000);
		} catch (IOException e) {
			//Do nothing
		}
	}
}
