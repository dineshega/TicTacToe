package com.bridgelabz;

public class TicTacToeGame {
	
		static char[] board;
		public static void main(String[] args) {
			board=new char[10];
		System.out.println("Welcome to TicTacToe");
		Board();
	}
		static void Board() {
			for (int i = 1; i < 10; i++) {
				board[i] = ' ';
			}
	}
}
