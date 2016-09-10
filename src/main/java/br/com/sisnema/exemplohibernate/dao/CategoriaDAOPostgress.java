package br.com.sisnema.exemplohibernate.dao;

public class CategoriaDAOPostgress extends CategoriaDAO {
	public CategoriaDAOPostgress() {
		super.setSession(getSessionPostgres());
	}

}
