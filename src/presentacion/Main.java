package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame{

	private BaseDatos baseDatos;
	private JTextField correo;
	private JTextField contra;
	
	public Main() {
		
		this.baseDatos = new BaseDatos();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(new GridLayout(3, 2, 10, 10));
		this.add(new JLabel("Correo"));
		this.correo = new JTextField();
		this.add(this.correo);
		this.add(new JLabel("Cotra"));
		this.contra = new JTextField();
		this.add(this.contra);
		JButton bRetirar = new JButton("Retirar");
		bRetirar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				crearCuenta();
				
			}
		});
		this.add(bRetirar);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new Main();

	}

}
