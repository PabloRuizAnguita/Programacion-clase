package Interfaz_Login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import MYSQL.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class Ventana_registro extends JFrame {

	private JPanel contentPane;
	private JTextField insertar_nombre_registro;
	private JTextField insertar_apellidos_registro;
	private JTextField insertar_correo_registro;
	private JTextField insertar_usuario_registro;
	private JPasswordField insertar_contraseña_registro;

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
		titulo_registro.setForeground(SystemColor.window);
		titulo_registro.setFont(new Font("Arial Black", Font.PLAIN, 21));
		titulo_registro.setBounds(102, 0, 238, 53);
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
		
		insertar_contraseña_registro = new JPasswordField();
		insertar_contraseña_registro.setEchoChar('*');
		insertar_contraseña_registro.setBounds(122, 221, 218, 20);
		contentPane.add(insertar_contraseña_registro);
		
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
		
		JLabel contraseña_registro = new JLabel("Contraseña");
		contraseña_registro.setForeground(new Color(205, 133, 63));
		contraseña_registro.setFont(new Font("Arial Black", Font.PLAIN, 14));
		contraseña_registro.setBounds(10, 222, 92, 14);
		contentPane.add(contraseña_registro);
		
		
		JButton boton_registarse_registro = new JButton("Registrar");
		boton_registarse_registro.setBounds(171, 286, 89, 23);
		contentPane.add(boton_registarse_registro);
		boton_registarse_registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
		

			
				if (insertar_nombre_registro.getText().length()==0 || insertar_apellidos_registro.getText().length()==0 || insertar_correo_registro.getText().length()==0 || insertar_usuario_registro.getText().length()==0 || insertar_contraseña_registro.getText().length()==0) {
                    JOptionPane.showMessageDialog(contentPane, "¿Estás seguro crack de que no faltan campos por completar?", "Registro.", JOptionPane.QUESTION_MESSAGE);
                }else {
                	
                	int cartel=JOptionPane.showConfirmDialog(boton_registarse_registro, "¿Seguro que has puesto todo correcto?");
                	
                		if(cartel==0) {
                			
                		usuarios registro = new usuarios();
                		registro.registrar(insertar_nombre_registro.getText(), insertar_usuario_registro.getText(), insertar_correo_registro.getText() , insertar_contraseña_registro.getText());
                		
                }
			}
}
		
			
		});
			

		JRadioButton ver_contraseña = new JRadioButton("Mostrar contraseña");
		ver_contraseña.setForeground(Color.BLUE);
		ver_contraseña.setBounds(282, 248, 126, 23);
		contentPane.add(ver_contraseña);
		
		
		
		JLabel Fondo_registrar = new JLabel("New label");
		Fondo_registrar.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		Fondo_registrar.setBounds(0, 0, 434, 361);
		contentPane.add(Fondo_registrar);
		ver_contraseña.addActionListener(new ActionListener() {
			boolean activo= false;
	        public void actionPerformed(ActionEvent e) {

	            if(!activo) {
	                activo=true;
	                insertar_contraseña_registro.setEchoChar((char)(0));

	            }else {
	                activo=false;
	                insertar_contraseña_registro.setEchoChar('*');

	            }
	        }
	    });	
	}
}

