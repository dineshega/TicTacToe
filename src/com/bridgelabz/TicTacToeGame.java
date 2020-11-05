package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	
		static char[] board;
		public static void main(String[] args) 
		{
		System.out.println("Welcome to TicTacToe");
		board=new char[10];
		populateBoard();
		char userInput = chooseXorO();
		char computer; /* computer Input */
			if (userInput == 'X')
			{
				computer = 'O';
			}
			else
			{
				computer = 'X';
			}
			System.out.println("userInput " + userInput + " computer entered " + computer);
		}

		/* usecase2 User input */
		private static char chooseXorO()
		{
			Scanner Input = new Scanner(System.in);
			while (true)
			{	
				System.out.println("Select X or O");
				char user = Input.next().toUpperCase().charAt(0);
				if (user == 'X') {
					return 'X';
				} else if (user == 'O') {
					return 'O';
				} else {
					System.out.println("Invalid choice,Enter again");
				}
			}
		}
		
		/* usecase1 Board is created and assigned empty space to each element*/
		private static void populateBoard() {
			for (int index = 1; index < board.length; index++)
			{
				board[index] = ' ';
			}
	}
}
