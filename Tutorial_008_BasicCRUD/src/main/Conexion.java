package main;
import java.util.logging.*;
import java.sql.*;

public class Conexion {
	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud","postgres","26081985");
//			String db = c.getMetaData().getDatabaseProductName();
//			String ver = c.getMetaData().getDatabaseProductVersion();
//			System.out.println(db + " " + ver + " te da la Bienvenida");
			
			Statement st = c.createStatement();
			ResultSet rs =  st.executeQuery("SELECT * FROM ALUMNOS");
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				Date fechanac = rs.getDate("fecha_nac");
				System.out.println("Resultado: " + id + " - " + nombre + " - " + apellido + " - " + fechanac);
			}
			
			c.close();
		} catch (SQLException ex) {
			// TODO: handle exception
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
		}
	}
}
