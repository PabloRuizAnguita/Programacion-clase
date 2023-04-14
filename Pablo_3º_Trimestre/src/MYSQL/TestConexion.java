package MYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Interfaz_Login.Ventana_registro;

public class TestConexion {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM pgweb");
			
			while (rs.next()) {
				String Nombre = rs.getString(1);
				String Usuario = rs.getString(2);
				String Correo = rs.getString(3);
				String Contraseña = rs.getString(4);
				
				System.out.println(Nombre + " - " + Usuario + " - " + Correo + " - " + Contraseña);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
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
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO pgweb(Nombre,Usuario, Correo, Contraseña) VALUES (?,?,?,?)");
			stm2.setString(1 , "Juan");
			stm2.setString(2 , "Juanillo22");
			stm2.setString(3 , "juan2003@gmail.com");
			stm2.setString(4 , "Juan2003");
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
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
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("UPDATE mi página web SET Nombre = ?  WHERE Usuario = ?");
			stm2.setString(1 , "Juan");
			stm2.setString(2 , "Juanillo22");
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
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
		
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("DELETE FROM pgweb  WHERE Nombre = ?");
			stm2.setString(1 , "Juan");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
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
		
	}
}
