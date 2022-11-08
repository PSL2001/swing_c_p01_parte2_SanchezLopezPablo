/**
 * swing_c_p01_parte2_SanchezLopezPablo - swing_c_p01_parte2_SanchezLopezPablo - Panel.java
 * 8 nov 2022 - 8:20:52
 * @author Pablo Sánchez López
 */
package swing_c_p01_parte2_SanchezLopezPablo;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class Panel.
 *
 * @author usuario
 */
public class Panel extends JPanel implements ActionListener {
	
	/** The layout. */
	private GridBagLayout layout;
	
	/** The constraints. */
	private GridBagConstraints constraints;
	
	/** The ltel. */
	private JLabel luser, lpass, ltel;
	
	/** The ftftel. */
	private JFormattedTextField ftfuser, ftftel;
	
	/** The pfpass. */
	private JPasswordField pfpass;
	
	/** The mftel. */
	private MaskFormatter mfuser, mftel;
	
	/** The btn. */
	private JButton btn;
	
	/**
	 * Instantiates a new panel.
	 */
	public Panel() {
		//instanciamos el layout y las constraints
		layout = new GridBagLayout();
		constraints = new GridBagConstraints();
		this.setLayout(layout);
		
		//Instanciamos los labels
		luser = new JLabel("Usuario");
		lpass = new JLabel("Contraseña");
		ltel = new JLabel("Telefono");
		btn = new JButton("Enviar");
		
		try {
			//Añadimos los maskformatter
			mfuser = new MaskFormatter("AAAAAA");
			mftel = new MaskFormatter("#########");
			//Y lo añadimos al formatted text field
			ftfuser = new JFormattedTextField(mfuser);
			ftftel = new JFormattedTextField(mftel);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pfpass = new JPasswordField();
		
		//Creamos insets que son espaciados en el gridlayout
		constraints.insets = new Insets(0, 0, 10, 0);
		//Añadimos un padding en x (padding para las filas)
		constraints.ipadx = 100;
		
		//Creamos las constraints y añadimos
		constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    this.add(luser,constraints);

	    constraints.gridx = 1;
	    constraints.gridy = 0;
	    this.add(ftfuser,constraints);

	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    this.add(lpass,constraints);

	    constraints.gridx = 1;
	    constraints.gridy = 1;
	    this.add(pfpass,constraints); 
	    
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.gridx = 0;
	    constraints.gridy = 2;
	    this.add(ltel,constraints);

	    constraints.gridx = 1;
	    constraints.gridy = 2;
	    this.add(ftftel,constraints);
	    
	    //Listeners
	    btn.addActionListener(this);
	    
	    constraints.gridx = 0;
	    constraints.gridy = 3;      
	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.gridwidth = 0;
	    this.add(btn,constraints);  
		
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Mustra un messagedialog con los datos introducidos
		JOptionPane.showMessageDialog(this, "Datos \n Usuario: " + ftfuser.getText().trim() + "\nContraseña: " + pfpass.getPassword().toString() + "\nTelefono: " + ftftel.getText());
		
	}
}
