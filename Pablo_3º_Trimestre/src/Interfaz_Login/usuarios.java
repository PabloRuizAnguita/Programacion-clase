package Interfaz_Login;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import MYSQL.Conexion;

public class usuarios {

	
	private static Component contentPane;
	String nombre;
	String usuario;
	String correo;
	String contraseña;
	
	public static void registrar(String nombre, String usuario, String correo, String contraseña ) {
	
	Conexion conexion = new Conexion();
	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;
	
	try {
		cn = conexion.conectar();
		PreparedStatement stm2 = cn.prepareStatement("INSERT INTO pgweb(Nombre,Usuario, Correo, Contraseña) VALUES (?,?,?,?)");
		stm2.setString(1 , nombre);
		stm2.setString(2 , usuario);
		stm2.setString(3 , correo);
		stm2.setString(4 , contraseña);
		
		stm2.executeUpdate();
		
	} catch (SQLException l) {
		l.printStackTrace();
		
	} finally {
		try {
			if (rs!= null) {
				rs.close();
			}
			
			if (stm != null) {
				stm.close();
			}
			
			if (cn != null) {
				cn.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		JOptionPane.showMessageDialog(contentPane, "Se ha registrado correctamente", "Inicio de sesión de Usuario", JOptionPane.WARNING_MESSAGE);
	}		
	}






public static void logear(String usuario, String contraseña) {
	
int resultado=0;

Conexion conexion = new Conexion();
Connection cn = null;
Statement stm = null;
ResultSet rs = null;
PreparedStatement pst = null;
try {
	cn = conexion.conectar();
	stm = cn.createStatement();
	pst = cn.prepareStatement("SELECT * FROM pgweb WHERE usuario= ? AND contraseña= ?  ");
	pst.setString(1 , usuario);
	pst.setString(2 , contraseña);
	rs = pst.executeQuery();
	
	while (rs.next()) {
		String Usuario = rs.getString(2);
		String Contraseña = rs.getString(4);
		
			if(rs.next()) {
				resultado=1;
		
		}		
		}
	
} catch (SQLException l) {
	l.printStackTrace();
	
} finally {
	try {
		if (rs!= null) {
			rs.close();
		}
		
		if (stm != null) {
			stm.close();
		}
		
		if (cn != null) {
			cn.close();
		}
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}}






public static void borrar(String usuario) {
	
	

	Conexion conexion = new Conexion();
	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;

				try {
					cn = conexion.conectar();
					PreparedStatement stm2 = cn.prepareStatement("DELETE FROM pgweb  WHERE usuario = ?");
					stm2.setNString(1 , usuario);
					
					stm2.executeUpdate();
					
				} catch (SQLException a) {
					a.printStackTrace();
					
				} finally {
					try {
						if (rs!= null) {
							rs.close();
						}
						
						if (stm != null) {
							stm.close();
						}
						
						if (cn != null) {
							cn.close();
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}  
				JOptionPane.showMessageDialog(contentPane, "Ha borrado el usuario con exito", "Registro.", JOptionPane.YES_OPTION);
};
}



