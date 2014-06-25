package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {

		System.out.print("[INFO] Conectando ao banco...");

		try {
			System.out.println(" conectado!");
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21",
					"root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}