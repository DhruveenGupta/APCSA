package unit07_2darrays.practice;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		if (game != null && game.length() == 9)
		{
			for (int i = 0; i < 9; i++)
			{
				char ch = game.charAt(i);
				if (ch == 'x')
				{
					ch = 'X';
				}
				else if (ch == 'o')
				{
					ch = 'O';
				}
				if (ch != 'X' && ch != 'O')
				{
					ch = ' ';
				}
				mat[i / 3][i % 3] = ch;
			}
		}
		else
		{
			for (int r = 0; r < 3; r++)
			{
				for (int c = 0; c < 3; c++)
				{
					mat[r][c] = ' ';
				}
			}
		}
	}

	public String getWinner()
	{
		boolean xWin = false;
		boolean oWin = false;

		for (int i = 0; i < 3; i++)
		{
			xWin |= checkLine('X', mat[i][0], mat[i][1], mat[i][2]);
			oWin |= checkLine('O', mat[i][0], mat[i][1], mat[i][2]);
			xWin |= checkLine('X', mat[0][i], mat[1][i], mat[2][i]);
			oWin |= checkLine('O', mat[0][i], mat[1][i], mat[2][i]);
		}

		xWin |= checkLine('X', mat[0][0], mat[1][1], mat[2][2]);
		oWin |= checkLine('O', mat[0][0], mat[1][1], mat[2][2]);
		xWin |= checkLine('X', mat[0][2], mat[1][1], mat[2][0]);
		oWin |= checkLine('O', mat[0][2], mat[1][1], mat[2][0]);

		if (xWin && !oWin)
		{
			return "X";
		}
		if (oWin && !xWin)
		{
			return "O";
		}
		return "NO WINNER";
	}

	private boolean checkLine(char player, char a, char b, char c)
	{
		return a == player && b == player && c == player;
	}

	public String toString()
	{
		String output = "";
		for (int r = 0; r < 3; r++)
		{
			for (int c = 0; c < 3; c++)
			{
				char ch = mat[r][c];
				output += (ch == 0 ? ' ' : ch);
				if (c < 2)
				{
					output += " ";
				}
			}
			if (r < 2)
			{
				output += "\n";
			}
		}
		return output;
	}
}
