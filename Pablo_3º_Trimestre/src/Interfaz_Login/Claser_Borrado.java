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
		usuario_borrar_introducir.setBounds(142, 208, 124, 20);
		contentPane.add(usuario_borrar_introducir);
		usuario_borrar_introducir.setColumns(10);
		
		JLabel usuario_borrar_letras = new JLabel("Usuario a Borrar");
		usuario_borrar_letras.setForeground(Color.ORANGE);
		usuario_borrar_letras.setFont(new Font("Sylfaen", Font.BOLD, 15));
		usuario_borrar_letras.setBounds(21, 200, 111, 41);
		contentPane.add(usuario_borrar_letras);
		
		JButton boton_borrar_borrado = new JButton("Borrar");
		boton_borrar_borrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuarios borrado = new usuarios();
        		borrado.borrar(usuario_borrar_introducir.getText());
        		
			}});
		boton_borrar_borrado.setBounds(308, 207, 89, 23);
		contentPane.add(boton_borrar_borrado);
		
		
		
		
		
		
		
		
			
		
		
		
		JLabel lblNewLabel = new JLabel("Base de Datos");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(141, 11, 222, 33);
		contentPane.add(lblNewLabel);
		
		tabla_BBDD = new JTable();
		tabla_BBDD.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Usuario", "Correo", "Contrase\u00F1a"
			}
		));
		tabla_BBDD.setBounds(21, 43, 378, 154);
		contentPane.add(tabla_BBDD);
	}
}
