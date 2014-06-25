package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAlterar {
	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setId(2L);
		contato.setNome("Caelum");
		contato.setEmail("123456@caelum.com.br");
		contato.setEndereco("R. Senador 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		dao.altera(contato);
	}

}
