import javax.swing.*;

/**
 * Klas testuse
 */
public class GraphTest {

	public static void main(String[] args) {

		GraphPanel panel = new GraphPanel(1366,768,Integer.parseInt(JOptionPane.showInputDialog("Input acceleration")),
				Integer.parseInt(JOptionPane.showInputDialog("Input Velocity")));

	}
	
}
