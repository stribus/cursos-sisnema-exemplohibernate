package br.com.sisnema.exemplohibernate.dao;

import java.util.List;

public interface IDAO<T> {

	void salvar(T pojo);
	void excluir(T pojo);
	T obterPorId(T filtro);
	List<T> pesquisar(T filtros);
}
