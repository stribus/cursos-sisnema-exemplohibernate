package br.com.sisnema.exemplohibernate.dao;

public class CategoriaDAOFirebird extends CategoriaDAO {
	public CategoriaDAOFirebird() {
		super.setSession(getSessionFirebird());
	}

}
