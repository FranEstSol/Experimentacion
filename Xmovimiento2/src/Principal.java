import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;


public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField Posicion;
	private JTextField CajaX;
	private JTextField CajaY;
	private JTextField CajaLocate;
	private JTextField SystemMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//BOTONES
		JButton Left = new JButton("Izquierda");
		Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int EjeY;
				EjeY = Integer.parseInt (CajaY.getText());
				if (EjeY > -10)
				{
				CajaY.setText(String.valueOf(EjeY-1));
				SystemMsg.setText("");
				} else {
					SystemMsg.setText("No puedes seguir avanzando, da la vuelta");	
				}
			}
		});
		Left.setBounds(52, 64, 96, 64);
		contentPane.add(Left);
		
		JButton Right = new JButton("Derecha");
		Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int EjeY;
				EjeY = Integer.parseInt (CajaY.getText());
				if (EjeY <10)
				{
				CajaY.setText(String.valueOf(EjeY+1));
				SystemMsg.setText("");
				} else {
					SystemMsg.setText("No puedes seguir avanzando, da la vuelta");	
				}
			}
		});
		Right.setBounds(264, 64, 96, 64);
		contentPane.add(Right);
		
		
		JButton Up = new JButton("Arriba");
		Up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int EjeX;
				EjeX = Integer.parseInt (CajaX.getText());
				if (EjeX <10)
				{
				CajaX.setText(String.valueOf(EjeX+1));
				SystemMsg.setText("");
				} else {
					SystemMsg.setText("No puedes seguir avanzando, da la vuelta");	
				}
			}
		});
		Up.setBounds(158, 11, 96, 64);
		contentPane.add(Up);
		
		
		JButton Down = new JButton("Abajo");
		Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int EjeX;
				EjeX = Integer.parseInt (CajaX.getText());
				if (EjeX >-10)
					
				{
				CajaX.setText(String.valueOf(EjeX-1));
				SystemMsg.setText("");
				} else {
					SystemMsg.setText("No puedes seguir avanzando, da la vuelta");	
				}
			}
		});
		Down.setBounds(158, 120, 96, 64);
		contentPane.add(Down);
		
		
		Posicion = new JTextField();
		Posicion.setText("Tu posicion actual es: ");
		Posicion.setEditable(false);
		Posicion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Posicion.setBounds(100, 207, 130, 37);
		contentPane.add(Posicion);
		Posicion.setColumns(10);
		
		//INDICADOR DE POSICION
		CajaX = new JTextField();
		CajaX.setForeground(Color.BLACK);
		CajaX.setText("0");
		CajaX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CajaX.setEditable(false);
		CajaX.setColumns(10);
		CajaX.setBounds(286, 206, 32, 37);
		contentPane.add(CajaX);
		
		CajaY = new JTextField();
		CajaY.setText("0");
		CajaY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CajaY.setEditable(false);
		CajaY.setColumns(10);
		CajaY.setBounds(361, 206, 32, 37);
		contentPane.add(CajaY);
		
		JLabel lblNewLabel = new JLabel("X=");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(255, 211, 32, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblY = new JLabel("Y=");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY.setBounds(328, 211, 32, 27);
		contentPane.add(lblY);
		
		// FUNCIONES DE LOCALIZACION
		JButton Locate = new JButton("Localizacion actual");
		Locate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int EjeX=0;
				int EjeY=0;
				EjeX = Integer.parseInt (CajaX.getText());
				EjeY = Integer.parseInt (CajaY.getText());
				CajaLocate.setText("Tu posicion actual es: X= " + (EjeX) + "  Y= " + (EjeY));
			}
		});
		Locate.setBounds(426, 11, 130, 37);
		contentPane.add(Locate);
		
		CajaLocate = new JTextField();
		CajaLocate.setEditable(false);
		CajaLocate.setBounds(426, 55, 130, 45);
		contentPane.add(CajaLocate);
		CajaLocate.setColumns(10);
		
		SystemMsg = new JTextField();
		SystemMsg.setEditable(false);
		SystemMsg.setBounds(274, 142, 300, 27);
		contentPane.add(SystemMsg);
		SystemMsg.setColumns(10);
	}
}
