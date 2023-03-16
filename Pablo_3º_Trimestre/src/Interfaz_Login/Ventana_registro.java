package Interfaz_Login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Ventana_registro extends JFrame {

	private JPanel contentPane;
	private JTextField Insertar_nombre_registro;
	private JTextField Insertar_apellidos_registro;
	private JTextField Insertar_correo_registro;
	private JTextField Insertar_usuario_registro;
	private JTextField Insertar_contraseña_registro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_registro frame = new Ventana_registro();
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
	public Ventana_registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo_registro = new JLabel("Registro De Cuenta");
		Titulo_registro.setForeground(new Color(0, 255, 0));
		Titulo_registro.setFont(new Font("Arial Black", Font.PLAIN, 21));
		Titulo_registro.setBounds(117, 0, 238, 53);
		contentPane.add(Titulo_registro);
		
		JLabel Nombre_registro = new JLabel("Nombre");
		Nombre_registro.setForeground(new Color(205, 133, 63));
		Nombre_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Nombre_registro.setBounds(10, 65, 60, 14);
		contentPane.add(Nombre_registro);
		
		JLabel Apellidos_registro = new JLabel("Apellidos");
		Apellidos_registro.setForeground(new Color(205, 133, 63));
		Apellidos_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Apellidos_registro.setBounds(10, 106, 81, 14);
		contentPane.add(Apellidos_registro);
		
		Insertar_nombre_registro = new JTextField();
		Insertar_nombre_registro.setBounds(80, 64, 196, 20);
		contentPane.add(Insertar_nombre_registro);
		Insertar_nombre_registro.setColumns(10);
		
		Insertar_apellidos_registro = new JTextField();
		Insertar_apellidos_registro.setBounds(102, 105, 196, 20);
		contentPane.add(Insertar_apellidos_registro);
		Insertar_apellidos_registro.setColumns(10);
		
		Insertar_correo_registro = new JTextField();
		Insertar_correo_registro.setBounds(80, 142, 196, 20);
		contentPane.add(Insertar_correo_registro);
		Insertar_correo_registro.setColumns(10);
		
		Insertar_usuario_registro = new JTextField();
		Insertar_usuario_registro.setBounds(171, 185, 196, 20);
		contentPane.add(Insertar_usuario_registro);
		Insertar_usuario_registro.setColumns(10);
		
		Insertar_contraseña_registro = new JTextField();
		Insertar_contraseña_registro.setBounds(129, 216, 196, 20);
		contentPane.add(Insertar_contraseña_registro);
		Insertar_contraseña_registro.setColumns(10);
		
		JLabel Correo_registro = new JLabel("Correo");
		Correo_registro.setForeground(new Color(205, 133, 63));
		Correo_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Correo_registro.setBounds(10, 143, 60, 14);
		contentPane.add(Correo_registro);
		
		JLabel Usuario_registro = new JLabel("Nombre de Usuario");
		Usuario_registro.setForeground(new Color(205, 133, 63));
		Usuario_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Usuario_registro.setBounds(10, 186, 151, 14);
		contentPane.add(Usuario_registro);
		
		JLabel Contraseña_registro = new JLabel("Contarseña");
		Contraseña_registro.setForeground(new Color(205, 133, 63));
		Contraseña_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Contraseña_registro.setBounds(10, 217, 92, 14);
		contentPane.add(Contraseña_registro);
		
		JButton Boton_registarse_registro = new JButton("Registrarse");
		Boton_registarse_registro.setBounds(169, 279, 110, 23);
		contentPane.add(Boton_registarse_registro);
		
		JLabel Fondo_registro = new JLabel("New label");
		Fondo_registro.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		Fondo_registro.setBounds(0, 0, 434, 361);
		contentPane.add(Fondo_registro);
		
		Boton_registarse_registro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Su registro se han realizado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
	}
}
