package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	
		static char[] board;
		public static void main(String[] args) 
		{
		System.out.println("Welcome to TicTacToe");
		board=new char[10];
		populateBoard();
		char userInput= chooseXorO();
		char Computer;
			if (userInput == 'X')
			{
				Computer = 'O';
			} 
			else
			{
				Computer = 'X';
			}
		}

		/* usecase2 User and Computer input */
		private static char chooseXorO()
		{
			Scanner Input = new Scanner(System.in);
			System.out.println("Select X or O");
			char user = Input.next().toUpperCase().charAt(0);
			return user;
		}
		
		/* usecase1 Board is created and assigned empty space to each element*/
		private static void populateBoard() {
			for (int index = 1; index < board.length; index++)
			{
				board[index] = ' ';
			}
	}
}
