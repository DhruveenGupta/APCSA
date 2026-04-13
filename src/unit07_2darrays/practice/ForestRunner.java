//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package unit07_2darrays.practice;

import java.io.IOException;


public class ForestRunner
{
	public static void main( String args[] ) throws IOException
	{
		for( int i = 0; i < 3; i++ )   //change the 3 to whatever you want
		{
			//add in keyboard input for numrows and numcols
			Forest woods = new Forest(7, 5);
			System.out.println( woods + "\n\n");
			System.out.println( woods.setTrappedToNull() + "\n\n");
			System.out.println( woods + "\n\n");
		}
	}
}



