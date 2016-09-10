package br.com.sisnema.exemplohibernate.dao;

public class CategoriaDAOMysql extends CategoriaDAO {
	
	public CategoriaDAOMysql() {
		super.setSession(getSessionMysql());
	}

}
