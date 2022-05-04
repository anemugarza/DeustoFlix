package ventanas;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana1 extends JFrame{
	private JButton registrarse;
	private JButton logIn;
	
	public Ventana1()  {
		inicializar();
	}

	private void inicializar() {
		registrarse= new JButton("Registrarse");
		logIn= new JButton("Log In");
		registrarse.setFont(new Font("Serif", Font.PLAIN, 50));
		registrarse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro ventana = new VentanaRegistro();
				ventana.setVisible(true);
			}
			
		});
		logIn.setFont(new Font("Serif", Font.PLAIN, 50));
		
		this.add(registrarse);
		this.add(logIn);
		
		this.setSize(400,200);
		this.setTitle("NETFLIX");
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Cerrando");
				System.exit(0);
			}
		});
	}
}
