package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board;
	public static void main(String[] args) 
	{
		System.out.println("Welcome to TicTacToe");
		board=new char[10];
		createBoard();
		char userInput=chooseXorO();
		showBoard();
	}
	
	/* usecase3 Displaying the Board */
	private static void showBoard() 
	{
		for (int index = 1; index < board.length; index = index + 3) 
		{
			System.out.println("| " + board[index] + " | " + board[index + 1] + " | " + board[index + 2] + " |");
		}
	}

	/* usecase2 User input */
	private static char chooseXorO()
	{
		char computer='X'; 
		Scanner Input = new Scanner(System.in);
		while (true)
		{	
			System.out.println("Select X or O");
			char user = Input.next().toUpperCase().charAt(0);
			if (user == 'X')
			{
				computer='O';
			} 
			else if (user == 'O') 
			{
				computer='X';
			} 
			else 
			{
				System.out.println("Invalid choice,Enter again");
			}
			System.out.println("userInput " + user + " computer entered " + computer);
			return user;
		}
	}

	/* usecase1 Board is created and assigned empty space to each element */
	private static void createBoard() 
	{
		for (int index = 1; index < board.length; index++)
		{
			board[index] = ' ';
		}
	}
}
