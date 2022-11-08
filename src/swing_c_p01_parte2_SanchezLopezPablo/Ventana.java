/**
 * swing_c_p01_parte2_SanchezLopezPablo - swing_c_p01_parte2_SanchezLopezPablo - Ventana.java
 * 8 nov 2022 - 8:19:00
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte2_SanchezLopezPablo;

import javax.swing.JFrame;

// TODO: Auto-generated Javadoc
/**
 * The Class Ventana.
 *
 * @author usuario
 */
public class Ventana extends JFrame {
	
	/** The panel. */
	private Panel panel;
	
	/**
	 * Instantiates a new ventana.
	 */
	public Ventana() {
		super("Swing Compendio P01 Parte 2 Pablo Sánchez López");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new Panel();
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}

}
