package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConsultaPorId {

	public static void main(String[] args) {

		Long id = 1l;

		ContatoDAO dao = new ContatoDAO();

		Contato contato = dao.buscaPorId(id);

		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endereço: " + contato.getEndereco());
		System.out.println("Data de Nascimento: "
				+ new SimpleDateFormat("dd/MM/yyyy").format(contato
						.getDataNascimento().getTime()) + "\n");

	}
}
