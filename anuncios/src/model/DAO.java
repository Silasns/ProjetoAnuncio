package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	//Modulo de Conex�o 
	//Pam�metros da cone��o	
	private String drive = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbanuncio?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "card265!@";
	
	//M�todo de conex�o
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(drive);
			//"con" estabelece uma se��o com o banco de dados
			//DriverManager � classe que vai gerenciar o driver
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//teste de conex�o
	/*public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
	}*/
}

