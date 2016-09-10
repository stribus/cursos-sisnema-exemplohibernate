package br.com.sisnema.exemplohibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Midia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_midia")
	private Integer codigo;
	
	@ManyToOne
	@JoinColumn(name="cod_filme",nullable=false)
	private Filme filme;
	
	@Column(nullable=false)
	private boolean inutilizada;

	public Midia() {
		super();
	}

	public Midia(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public Midia(Integer codigo, Filme filme, boolean inutilizada) {
		super();
		this.codigo = codigo;
		this.filme = filme;
		this.inutilizada = inutilizada;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public boolean isInutilizada() {
		return inutilizada;
	}

	public void setInutilizada(boolean inutilizada) {
		this.inutilizada = inutilizada;
	}

	@Override
	public String toString() {
		return "Midia [codigo=" + codigo + ", filme=" + filme + ", inutilizada=" + inutilizada + "]";
	}

}
