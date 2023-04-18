package Interfaz_Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MYSQL.Conexion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Claser_Borrado extends JFrame {

	private JPanel contentPane;
	private JTextField usuario_borrar_introducir;
	private JTable tabla_BBDD;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Claser_Borrado frame = new Claser_Borrado();
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
	public Claser_Borrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuario_borrar_introducir = new JTextField();
		usuario_borrar_introducir.setBounds(142, 197, 124, 20);
		contentPane.add(usuario_borrar_introducir);
		usuario_borrar_introducir.setColumns(10);
		
		
		JLabel usuario_borrar_letras = new JLabel("Usuario a Borrar");
		usuario_borrar_letras.setForeground(Color.ORANGE);
		usuario_borrar_letras.setFont(new Font("Sylfaen", Font.BOLD, 15));
		usuario_borrar_letras.setBounds(21, 189, 111, 41);
		contentPane.add(usuario_borrar_letras);
		
		JButton boton_borrar_borrado = new JButton("Borrar");
		boton_borrar_borrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
        		usuarios.borrar(usuario_borrar_introducir.getText());
        		usuarios.antoniobasededatos(tabla_BBDD);
        		
			}});
		boton_borrar_borrado.setBounds(308, 196, 99, 23);
		contentPane.add(boton_borrar_borrado);
		

		
		JLabel Titulo_borrado = new JLabel("Base de Datos");
		Titulo_borrado.setForeground(SystemColor.window);
		Titulo_borrado.setFont(new Font("Tahoma", Font.BOLD, 18));
		Titulo_borrado.setBounds(141, 11, 162, 33);
		contentPane.add(Titulo_borrado);
		
		tabla_BBDD = new JTable();
		tabla_BBDD.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabla_BBDD.setBackground(Color.LIGHT_GRAY);
		tabla_BBDD.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Usuario", "Correo", "Contrase\u00F1a"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		usuarios.antoniobasededatos(tabla_BBDD);
		tabla_BBDD.setBounds(21, 78, 403, 97);
		contentPane.add(tabla_BBDD);
		
		JButton Cerrar_serion = new JButton("Volver atrás");
		Cerrar_serion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFrame cerrar_sesion= new Login();
				 cerrar_sesion.setVisible(true);
		         setVisible(false);
			}
		});
		Cerrar_serion.setBounds(308, 230, 99, 23);
		contentPane.add(Cerrar_serion);
		
		JLabel Nombre_tabla = new JLabel("Nombre");
		Nombre_tabla.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		Nombre_tabla.setForeground(Color.WHITE);
		Nombre_tabla.setBounds(21, 65, 58, 14);
		contentPane.add(Nombre_tabla);
		
		JLabel Usuario_tabla = new JLabel("Usuario");
		Usuario_tabla.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		Usuario_tabla.setForeground(Color.WHITE);
		Usuario_tabla.setBounds(124, 65, 58, 14);
		contentPane.add(Usuario_tabla);
		
		JLabel Correo_tabla = new JLabel("Correo");
		Correo_tabla.setForeground(Color.WHITE);
		Correo_tabla.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		Correo_tabla.setBounds(225, 65, 46, 14);
		contentPane.add(Correo_tabla);
		
		JLabel Contraseña_tabla = new JLabel("Contraseña");
		Contraseña_tabla.setForeground(Color.WHITE);
		Contraseña_tabla.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		Contraseña_tabla.setBounds(321, 65, 76, 14);
		contentPane.add(Contraseña_tabla);
		
		JLabel Fondo_borrado = new JLabel("Correo");
		Fondo_borrado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Fondo_borrado.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		Fondo_borrado.setBounds(0, 0, 434, 261);
		contentPane.add(Fondo_borrado);
		
		
		
	}
}
