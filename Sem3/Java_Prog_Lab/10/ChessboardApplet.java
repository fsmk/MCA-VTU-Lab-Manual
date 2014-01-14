import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class ChessboardApplet extends JApplet {

	private static final long serialVersionUID = 1L;
	private static final int CHESSBORD_NUMBER_OF_COLUMNS = 8;

	/**
	 * Paint function will call each time to draw the screen
	 */
	public void paint(Graphics g) {
		// Drawing 8 * 8 chess board
		for (int i = 0; i < CHESSBORD_NUMBER_OF_COLUMNS; i++)
			for (int j = 0; j < CHESSBORD_NUMBER_OF_COLUMNS; j++) {
				// Checking for alternative colors
				if ((i + j) % 2 == 0)
					// Changing current color to white
					g.setColor(Color.white);
				else
					// Changing current color to black
					g.setColor(Color.black);
				// Dynamically drawing chess board columns
				g.fillRect(getColumn() * j, getColumn() * i, getColumn(),
						getColumn());
			}
	}

	/**
	 * Function to get each column size of chess board dynamically with respect
	 * to Applet size.
	 * 
	 * @return Column size
	 */
	private int getColumn() {
		// Finding the minimum value of width and height and finding each column
		// size
		return Math.min(getWidth(), getHeight()) / CHESSBORD_NUMBER_OF_COLUMNS;
	}

}
