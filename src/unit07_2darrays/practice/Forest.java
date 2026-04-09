//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package unit07_2darrays.practice;
import java.util.Scanner;
import static java.lang.System.*;

public class Forest
{
	private Thing[][] grid;

	public Forest(int rows, int cols)
	{
		final String[] typeList = "cat dog tree rock".split(" ");
		final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
		
		grid = new Thing[rows][cols];
		for(int r = 0; r < rows; r++)
		{
			for(int c = 0; c < cols; c++)
			{
				String type = typeList[(int)(Math.random() * typeList.length)];
				String name = nameList[(int)(Math.random() * nameList.length)];
				double size = 1 + Math.random() * 20;
				grid[r][c] = new Thing(type, name, size);
			}
		}
	}

	public int setTrappedToNull( )
	{
		int count = 0;
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[r].length; c++)
			{
				if(grid[r][c] != null && isTrapped(r, c))
				{
					grid[r][c] = null;
					count++;
				}
			}
		}
		return count;
	}
	
	//if location ! a rock && 
	//is surrounded by > 5 trees or rocks larger than 10
	public boolean isTrapped( int r, int c)
	{
		if(!inBounds(r, c) || grid[r][c] == null)
		{
			return false;
		}
		if(grid[r][c].getType().equals("rock"))
		{
			return false;
		}

		int surrounding = 0;
		for(int dr = -1; dr <= 1; dr++)
		{
			for(int dc = -1; dc <= 1; dc++)
			{
				if(dr == 0 && dc == 0)
				{
					continue;
				}
				int nr = r + dr;
				int nc = c + dc;
				if(inBounds(nr, nc) && grid[nr][nc] != null)
				{
					Thing neighbor = grid[nr][nc];
					if(neighbor.getType().equals("tree") || (neighbor.getType().equals("rock") && neighbor.getSize() > 10))
					{
						surrounding++;
					}
				}
			}
		}

		return surrounding > 5;
	}

	private boolean inBounds( int r, int c)
	{
		return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
	}


	public String toString()
	{
		String output = "";
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[r].length; c++)
			{
				if(grid[r][c] == null)
				{
					output += "null\t";
				}
				else
				{
					output += grid[r][c].toString() + "\t";
				}
			}
			output += "\n";
		}
		return output;
	}
}


