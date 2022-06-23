package com.exemplo.sqlconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploSQL {

	public static void main(String[] args) {
		// try/catch
		try {
			Connection cn;
			cn = DriverManager.getConnection("jdbc:oracle:thin:local:1512:orcl", "scott", "tiger");
		}catch(SQLException e) {
			System.out.println("Não foi possivel habilitar a conexão com o DB.");
			e.printStackTrace();
			
		}

	}

}
