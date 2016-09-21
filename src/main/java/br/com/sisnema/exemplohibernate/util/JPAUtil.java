package br.com.sisnema.exemplohibernate.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY_POSTGRES;
	private static final EntityManagerFactory FACTORY_MYSQL;
	private static final EntityManagerFactory FACTORY_FIREBIRD = null;
	
	static {
		FACTORY_MYSQL = Persistence.createEntityManagerFactory("persistence-mysql");
//		FACTORY_MYSQL = null;
//		FACTORY_POSTGRES = Persistence.createEntityManagerFactory("persistence-postgres");
		FACTORY_POSTGRES = null;
//		FACTORY_FIREBIRD = Persistence.createEntityManagerFactory("persistence-firebird");
	}
	
	public static EntityManager getEntityManagerPostgres(){
		return FACTORY_POSTGRES.createEntityManager();
	}
	
	public static EntityManager getEntityManagerMysql(){
		return FACTORY_MYSQL.createEntityManager();
	}

	public static EntityManager getEntityManagerFirebird() {
		return FACTORY_FIREBIRD.createEntityManager();
	}
}
