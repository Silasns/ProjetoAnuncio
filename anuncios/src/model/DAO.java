package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	//Modulo de Conexão 
	//Pamâmetros da coneção	
	private String drive = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbanuncio?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "card265!@";
	
	//Método de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(drive);
			//"con" estabelece uma seção com o banco de dados
			//DriverManager é classe que vai gerenciar o driver
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//teste de conexão
	/*public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
	}*/
}

