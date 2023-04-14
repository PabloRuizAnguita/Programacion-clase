package Interfaz_Login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Pagina_Recuperacion extends JFrame {

	private JPanel contentPane;
	private JTextField introducir_correo_recupericion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagina_Recuperacion frame = new Pagina_Recuperacion();
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
	public Pagina_Recuperacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel correo_recuperacion = new JLabel("Introduzca su correo");
		correo_recuperacion.setForeground(new Color(205, 133, 63));
		correo_recuperacion.setFont(new Font("Arial Black", Font.PLAIN, 14));
		correo_recuperacion.setBounds(10, 70, 162, 14);
		contentPane.add(correo_recuperacion);
		
		JLabel titulo_recuperacion = new JLabel("Recuperación De Contraseña");
		titulo_recuperacion.setForeground(SystemColor.window);
		titulo_recuperacion.setBounds(49, 11, 333, 31);
		titulo_recuperacion.setFont(new Font("Arial Black", Font.PLAIN, 21));
		contentPane.add(titulo_recuperacion);
		
		introducir_correo_recupericion = new JTextField();
		introducir_correo_recupericion.setBounds(182, 69, 242, 20);
		contentPane.add(introducir_correo_recupericion);
		introducir_correo_recupericion.setColumns(10);
		
		JButton boton_recuperacion = new JButton("Enviar Código De Recuperación");
		boton_recuperacion.setBounds(87, 128, 242, 23);
		contentPane.add(boton_recuperacion);
		
		JLabel fondo_recuperacion = new JLabel("New label");
		fondo_recuperacion.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		fondo_recuperacion.setBounds(0, 0, 434, 261);
		contentPane.add(fondo_recuperacion);
		
		boton_recuperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (introducir_correo_recupericion.getText().length()==0) {
                    JOptionPane.showMessageDialog(contentPane, "Correo no introducido.", "Inicio de sesión", JOptionPane.WARNING_MESSAGE);
                }else {
					
                	int cartel=JOptionPane.showConfirmDialog(boton_recuperacion, "¿Seguro que ha puesto su correo correctamente?");
                	
            		if(cartel==0) {
			JOptionPane.showMessageDialog(contentPane, "Se ha enviado correctamente el código de recuperación", "Recuperación", JOptionPane.INFORMATION_MESSAGE);
                }
			}
			}});
	}
}
