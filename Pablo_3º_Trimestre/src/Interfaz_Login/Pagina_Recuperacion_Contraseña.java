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

public class Pagina_Recuperacion_Contraseña extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	static Pagina_Recuperacion_Contraseña contraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contraseña = new Pagina_Recuperacion_Contraseña();
					contraseña.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pagina_Recuperacion_Contraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Introduzca su correo");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 70, 162, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Recuperación De Contraseña");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(49, 11, 333, 31);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(182, 69, 242, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar Código De Recuperación");
		btnNewButton.setBounds(87, 128, 242, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\thumb-1920-981156.jpg"));
		lblNewLabel_2.setBounds(-658, -144, 1129, 405);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Se ha enviado correctamente el código de recuperación", "Recuperación", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
	}
}
