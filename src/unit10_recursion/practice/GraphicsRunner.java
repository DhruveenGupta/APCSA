package unit10_recursion.practice;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		add(new RecursiveBoxes());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		SwingUtilities.invokeLater(() -> new GraphicsRunner());
	}
}