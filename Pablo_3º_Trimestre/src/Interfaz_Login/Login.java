package Interfaz_Login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.UIManager;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JTextField textField;
	
	static Login login;
	private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login = new Login();
					login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(35, 63, 67, 20);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(35, 94, 93, 20);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 96, 244, 20);
		passwordField.setColumns(10);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(138, 149, 105, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(contentPane, "Ha iniciado sesión correctamente", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
						
					}
				});
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Iniciar Sesión");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 31));
		lblNewLabel_2.setBounds(132, 11, 257, 27);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(132, 64, 282, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(275, 149, 105, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("He olvidado la contraseña");
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(UIManager.getColor("InternalFrame.inactiveBorderColor"));
		btnNewButton_2.setBounds(308, 115, 166, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JFrame frame = new Ventana_de_registrarse();
				frame.setVisible (true);
				login.setVisible (false);
			}
		});
		
		btnNewButton_2.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JFrame frame = new Pagina_Recuperacion_Contraseña();
				frame.setVisible (true);
				login.setVisible (false);
			}
		});
	}
}
