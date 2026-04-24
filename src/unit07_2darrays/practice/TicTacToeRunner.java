package unit07_2darrays.practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TicTacToeRunner
{
	public static void main( String args[] ) throws IOException
	{
		File file = new File("src/unit07_2darrays/practice/tictactoe.dat");
		if (!file.exists())
		{
			file = new File("unit07_2darrays/practice/tictactoe.dat");
		}
		if (!file.exists())
		{
			file = new File("tictactoe.dat");
		}

		Scanner fileScanner = new Scanner(file);
		if (!fileScanner.hasNextInt())
		{
			System.out.println("Missing game count in data file.");
			fileScanner.close();
			return;
		}

		int numGames = fileScanner.nextInt();
		System.out.println("Tic Tac Toe results");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < numGames && fileScanner.hasNext(); i++)
		{
			String game = fileScanner.next();
			TicTacToe board = new TicTacToe(game);
			String winner = board.getWinner();

			System.out.println("Game #" + (i + 1) + ": " + game);
			System.out.println(board);
			System.out.println("Winner: " + winner);
			System.out.println();
		}

		fileScanner.close();
	}
}
