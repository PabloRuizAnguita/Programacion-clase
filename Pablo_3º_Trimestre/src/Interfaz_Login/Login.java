package Interfaz_Login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MYSQL.Conexion;

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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel usuario_login;
	private JLabel contraseña_login;
	private JPasswordField introducir_contraseña_login;
	private JButton login_login;
	private JTextField introducir_usuario_login;
	private JButton olvidar_contraseña;
	private JLabel fondo_login;
	
	static Login log;
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
		
		usuario_login = new JLabel("Usuario");
		usuario_login.setForeground(new Color(205, 133, 63));
		usuario_login.setBounds(10, 64, 93, 20);
		usuario_login.setFont(new Font("Arial Black", Font.PLAIN, 17));
		usuario_login.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(usuario_login);
		
		contraseña_login = new JLabel("Contraseña");
		contraseña_login.setForeground(new Color(205, 133, 63));
		contraseña_login.setFont(new Font("Arial Black", Font.PLAIN, 17));
		contraseña_login.setBounds(10, 96, 112, 20);
		contraseña_login.setHorizontalAlignment(SwingConstants.CENTER);
		contraseña_login.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(contraseña_login);
		
		introducir_contraseña_login = new JPasswordField();
		introducir_contraseña_login.setEchoChar('*');
		introducir_contraseña_login.setBounds(159, 96, 244, 20);
		introducir_contraseña_login.setColumns(10);
		contentPane.add(introducir_contraseña_login);
		
		login_login = new JButton("Login");
		login_login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		login_login.setBounds(132, 191, 105, 23);
		login_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (introducir_usuario_login.getText().length()==0 || introducir_contraseña_login.getText().length()==0)  {
                    JOptionPane.showMessageDialog(contentPane, "¿No es tan complicado rellenar todo, no?", "Inicio de sesión", JOptionPane.WARNING_MESSAGE);
                }else {
                	if(introducir_usuario_login.getText().equals("Antonio") && introducir_contraseña_login.getText().equals("R.Madrid")) {

                        JFrame borrar= new Claser_Borrado();
                        borrar.setVisible(true);
                        setVisible(false);

                    }else {
 
            		usuarios logeo = new usuarios();
            		
            		
            		if(logeo.logear(introducir_usuario_login.getText(), introducir_contraseña_login.getText())) {
            			JOptionPane.showMessageDialog(contentPane, "Ha iniciado sesión correctamente", "Inicio de sesión de Usuario", JOptionPane.YES_NO_CANCEL_OPTION);
            			
            		}else {
            			JOptionPane.showMessageDialog(contentPane, "El usuario no existe", "Inicio de sesión de Usuario", JOptionPane.WARNING_MESSAGE);
            		}
                                	
            }	}									
		}			
	});
			
			
		contentPane.add(login_login);
		
		JLabel titulo_login = new JLabel("Iniciar Sesión");
		titulo_login.setForeground(SystemColor.window);
		titulo_login.setFont(new Font("Arial Black", Font.PLAIN, 27));
		titulo_login.setBounds(142, 11, 257, 27);
		contentPane.add(titulo_login);
		
		
		
		introducir_usuario_login = new JTextField();
		introducir_usuario_login.setBounds(113, 64, 282, 20);
		contentPane.add(introducir_usuario_login);
		introducir_usuario_login.setColumns(10);
		
		JButton registrar_login = new JButton("Registrarse");
		registrar_login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		registrar_login.setBounds(284, 191, 105, 23);
		contentPane.add(registrar_login);
		
		
		
		olvidar_contraseña = new JButton("He olvidado la contraseña");
		olvidar_contraseña.setForeground(Color.BLUE);
		olvidar_contraseña.setBorder(null);
		olvidar_contraseña.setBackground(UIManager.getColor("InternalFrame.borderColor"));
		olvidar_contraseña.setBounds(86, 123, 166, 23);
		contentPane.add(olvidar_contraseña);
		
		JRadioButton mostrar_contraseña = new JRadioButton("Mostrar contraseña\r\n");
		mostrar_contraseña.addActionListener(new ActionListener() {
			boolean activo= false;
	        public void actionPerformed(ActionEvent e) {

	            if(!activo) {
	                activo=true;
	                introducir_contraseña_login.setEchoChar((char)(0));

	            }else {
	                activo=false;
	                introducir_contraseña_login.setEchoChar('*');

	            }


	        }
	    });
		
		mostrar_contraseña.setForeground(Color.BLUE);
		mostrar_contraseña.setBounds(335, 123, 131, 23);
		contentPane.add(mostrar_contraseña);
		
		fondo_login = new JLabel("New label");
		fondo_login.setIcon(new ImageIcon("C:\\Users\\pra00\\eclipse-workspace\\Pablo_3º_Trimestre\\src\\Imagenlogin\\nature-3082832_640.jpg"));
		fondo_login.setBounds(0, 0, 484, 261);
		contentPane.add(fondo_login);
		
		
		
		registrar_login.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JFrame frame = new Ventana_registro();
				frame.setVisible (true);
				log.setVisible (false);
			}
		});
		
		olvidar_contraseña.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JFrame frame = new Pagina_Recuperacion();
				frame.setVisible (true);
				log.setVisible (false);
			}
		});
	}
}
