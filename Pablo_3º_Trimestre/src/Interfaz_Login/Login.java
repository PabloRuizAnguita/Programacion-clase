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
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel Usuario_login;
	private JLabel Contraseña_login;
	private JPasswordField Introducir_contraseña_login;
	private JButton Login_login;
	private JTextField Introducir_usuario_login;
	
	static Login log;
	private JButton Olvidar_contraseña;
	private JLabel Fondo_login;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log = new Login();
					log.setVisible(true);
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
		
		Usuario_login = new JLabel("Usuario");
		Usuario_login.setForeground(new Color(205, 133, 63));
		Usuario_login.setBounds(10, 64, 93, 20);
		Usuario_login.setFont(new Font("Arial Black", Font.PLAIN, 17));
		Usuario_login.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(Usuario_login);
		
		Contraseña_login = new JLabel("Contraseña");
		Contraseña_login.setForeground(new Color(205, 133, 63));
		Contraseña_login.setFont(new Font("Arial Black", Font.PLAIN, 17));
		Contraseña_login.setBounds(10, 96, 112, 20);
		Contraseña_login.setHorizontalAlignment(SwingConstants.CENTER);
		Contraseña_login.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(Contraseña_login);
		
		Introducir_contraseña_login = new JPasswordField();
		Introducir_contraseña_login.setEchoChar('*');
		Introducir_contraseña_login.setBounds(159, 96, 244, 20);
		Introducir_contraseña_login.setColumns(10);
		contentPane.add(Introducir_contraseña_login);
		
		Login_login = new JButton("Login");
		Login_login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Login_login.setBounds(132, 191, 105, 23);
		Login_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_login.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(contentPane, "Ha iniciado sesión correctamente", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
						
					}
				});
			}
		});
		contentPane.add(Login_login);
		
		JLabel Titulo_login = new JLabel("Iniciar Sesión");
		Titulo_login.setForeground(new Color(0, 255, 0));
		Titulo_login.setFont(new Font("Arial Black", Font.PLAIN, 27));
		Titulo_login.setBounds(142, 11, 257, 27);
		contentPane.add(Titulo_login);
		
		Introducir_usuario_login = new JTextField();
		Introducir_usuario_login.setBounds(113, 64, 282, 20);
		contentPane.add(Introducir_usuario_login);
		Introducir_usuario_login.setColumns(10);
		
		JButton Registrar_login = new JButton("Registrarse");
		Registrar_login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Registrar_login.setBounds(284, 191, 105, 23);
		contentPane.add(Registrar_login);
		
		Olvidar_contraseña = new JButton("He olvidado la contraseña");
		Olvidar_contraseña.setForeground(Color.BLUE);
		Olvidar_contraseña.setBorder(null);
		Olvidar_contraseña.setBackground(UIManager.getColor("InternalFrame.borderColor"));
		Olvidar_contraseña.setBounds(86, 123, 166, 23);
		contentPane.add(Olvidar_contraseña);
		
		JRadioButton Mostrar_contraseña = new JRadioButton("Mostrar contraseña\r\n");
		Mostrar_contraseña.addActionListener(new ActionListener() {
			boolean activo= false;
	        public void actionPerformed(ActionEvent e) {

	            if(!activo) {
	                activo=true;
	                Introducir_contraseña_login.setEchoChar((char)(0));

	            }else {
	                activo=false;
	                Introducir_contraseña_login.setEchoChar('*');

	            }


	        }
	    });
		
		Mostrar_contraseña.setForeground(Color.BLUE);
		Mostrar_contraseña.setBounds(335, 123, 131, 23);
		contentPane.add(Mostrar_contraseña);
		
		Fondo_login = new JLabel("New label");
		Fondo_login.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		Fondo_login.setBounds(0, 0, 484, 261);
		contentPane.add(Fondo_login);
		
		
		
		Registrar_login.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JFrame frame = new Ventana_registro();
				frame.setVisible (true);
				log.setVisible (false);
			}
		});
		
		Olvidar_contraseña.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JFrame frame = new Pagina_Recuperacion();
				frame.setVisible (true);
				log.setVisible (false);
			}
		});
	}
}
