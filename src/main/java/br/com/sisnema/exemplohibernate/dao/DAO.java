package br.com.sisnema.exemplohibernate.dao;

import org.hibernate.Session;

import br.com.sisnema.exemplohibernate.util.JPAUtil;

public abstract class DAO<T> implements IDAO<T> {

	private Session sessionPostgres;
	private Session sessionMysql;

	public DAO() {
		sessionPostgres = JPAUtil.getEntityManagerPostgres().unwrap(Session.class);
		sessionMysql = JPAUtil.getEntityManagerMysql().unwrap(Session.class);
	}

	public Session getSessionPostgres() {
		return sessionPostgres;
	}

	public Session getSessionMysql() {
		return sessionMysql;
	}

}
