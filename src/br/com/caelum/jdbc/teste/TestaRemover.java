package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemover {
	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setId(2L);
		dao.remove(contato);
	}

}
