package com.bridgelabz;

public class TicTacToeGame {
	
		static char[] board;
		public static void main(String[] args) 
		{
		System.out.println("Welcome to TicTacToe");
		board=new char[10];
		populateBoard();
		}
		/* usecase1 Board is created and assigned empty space to each element*/
		static void populateBoard() {
			for (int index = 1; index < board.length; index++)
			{
				board[index] = ' ';
			}
	}
}
