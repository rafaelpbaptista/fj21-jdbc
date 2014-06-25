package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaConsultaPorNome {

	public static void main(String[] args) {

		String nome = "elm";

		ContatoDAO dao = new ContatoDAO();

		List<Contato> contatos = dao.buscaPorNome(nome);

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(contato
							.getDataNascimento().getTime()) + "\n");
		}

	}
}
