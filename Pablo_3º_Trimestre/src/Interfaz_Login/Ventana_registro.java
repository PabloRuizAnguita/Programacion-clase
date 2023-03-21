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
	private JTextField insertar_nombre_registro;
	private JTextField insertar_apellidos_registro;
	private JTextField insertar_correo_registro;
	private JTextField insertar_usuario_registro;
	private JTextField insertar_contraseña_registro;

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
		
		JLabel titulo_registro = new JLabel("Registro De Cuenta");
		titulo_registro.setForeground(new Color(0, 255, 0));
		titulo_registro.setFont(new Font("Arial Black", Font.PLAIN, 21));
		titulo_registro.setBounds(116, 0, 238, 53);
		contentPane.add(titulo_registro);
		
		JLabel nombre_registro = new JLabel("Nombre");
		nombre_registro.setForeground(new Color(205, 133, 63));
		nombre_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		nombre_registro.setBounds(10, 65, 60, 14);
		contentPane.add(nombre_registro);
		
		JLabel apellidos_registro = new JLabel("Apellidos");
		apellidos_registro.setForeground(new Color(205, 133, 63));
		apellidos_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		apellidos_registro.setBounds(10, 106, 81, 14);
		contentPane.add(apellidos_registro);
		
		insertar_nombre_registro = new JTextField();
		insertar_nombre_registro.setBounds(80, 64, 196, 20);
		contentPane.add(insertar_nombre_registro);
		insertar_nombre_registro.setColumns(10);
		
		insertar_apellidos_registro = new JTextField();
		insertar_apellidos_registro.setBounds(102, 105, 196, 20);
		contentPane.add(insertar_apellidos_registro);
		insertar_apellidos_registro.setColumns(10);
		
		insertar_correo_registro = new JTextField();
		insertar_correo_registro.setBounds(80, 142, 196, 20);
		contentPane.add(insertar_correo_registro);
		insertar_correo_registro.setColumns(10);
		
		insertar_usuario_registro = new JTextField();
		insertar_usuario_registro.setBounds(171, 185, 196, 20);
		contentPane.add(insertar_usuario_registro);
		insertar_usuario_registro.setColumns(10);
		
		insertar_contraseña_registro = new JTextField();
		insertar_contraseña_registro.setBounds(129, 216, 196, 20);
		contentPane.add(insertar_contraseña_registro);
		insertar_contraseña_registro.setColumns(10);
		
		JLabel correo_registro = new JLabel("Correo");
		correo_registro.setForeground(new Color(205, 133, 63));
		correo_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		correo_registro.setBounds(10, 143, 60, 14);
		contentPane.add(correo_registro);
		
		JLabel usuario_registro = new JLabel("Nombre de Usuario");
		usuario_registro.setForeground(new Color(205, 133, 63));
		usuario_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		usuario_registro.setBounds(10, 186, 151, 14);
		contentPane.add(usuario_registro);
		
		JLabel contraseña_registro = new JLabel("Contarseña");
		contraseña_registro.setForeground(new Color(205, 133, 63));
		contraseña_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		contraseña_registro.setBounds(10, 217, 92, 14);
		contentPane.add(contraseña_registro);
		
		JButton boton_registarse_registro = new JButton("Registrarse");
		boton_registarse_registro.setBounds(169, 279, 110, 23);
		contentPane.add(boton_registarse_registro);
		
		boton_registarse_registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (insertar_nombre_registro.getText().length()==0 || insertar_apellidos_registro.getText().length()==0 || insertar_correo_registro.getText().length()==0 || insertar_usuario_registro.getText().length()==0 || insertar_contraseña_registro.getText().length()==0) {
                    JOptionPane.showMessageDialog(contentPane, "Error, vuelva a introducir las credenciales.", "Registro.", JOptionPane.ERROR_MESSAGE);
                }else {
					
			JOptionPane.showMessageDialog(contentPane, "Se ha registrado correctamente.", "Registro", JOptionPane.INFORMATION_MESSAGE);
                }
			}
			});
		
		JLabel fondo_registro = new JLabel("New label");
		fondo_registro.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		fondo_registro.setBounds(0, -24, 434, 410);
		contentPane.add(fondo_registro);
		
		
	}
}

