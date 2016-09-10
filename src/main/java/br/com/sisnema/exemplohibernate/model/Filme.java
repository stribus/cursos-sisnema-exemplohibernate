package br.com.sisnema.exemplohibernate.model;

import java.util.Date;

public class Filme {

	private Integer codigo;
	private Categoria categoria;
	private String descricao;
	private Date ano;

	public Filme() {
		super();
	}

	public Filme(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public Filme(Integer codigo, Categoria categoria, String descricao, Date ano) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.descricao = descricao;
		this.ano = ano;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Filme [codigo=" + codigo + ", categoria=" + categoria + ", descricao=" + descricao + ", ano=" + ano
				+ "]";
	}

}
