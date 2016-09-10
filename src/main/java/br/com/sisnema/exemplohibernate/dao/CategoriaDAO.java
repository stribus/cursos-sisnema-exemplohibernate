package br.com.sisnema.exemplohibernate.dao;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.sisnema.exemplohibernate.model.Categoria;

public class CategoriaDAO extends DAO<Categoria> {

	private Session session;

	public void salvar(Categoria pojo) {
		session.beginTransaction();
		session.saveOrUpdate(pojo);
		session.getTransaction().commit();
	}

	public void excluir(Categoria pojo) {
		session.beginTransaction();
		session.delete(pojo);
		session.getTransaction().commit();
	}

	public Categoria obterPorId(Categoria filtro) {
		return session.get(Categoria.class, filtro.getCodigo());
	}

	public List<Categoria> pesquisar(Categoria filtros) {
		Criteria criteria = session.createCriteria(Categoria.class);
		
		if(StringUtils.isNotBlank(filtros.getDescricao())){
			criteria.add(Restrictions.ilike("descricao", filtros.getDescricao(),
									MatchMode.ANYWHERE));
		}
		
		return criteria.list();
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
