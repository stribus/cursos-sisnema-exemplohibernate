package br.com.sisnema.exemplohibernate.model;

public class Midia {

	private String codigo;
	private Filme filme;
	private boolean inutilizada;

	public Midia() {
		super();
	}

	public Midia(String codigo) {
		super();
		this.codigo = codigo;
	}

	public Midia(String codigo, Filme filme, boolean inutilizada) {
		super();
		this.codigo = codigo;
		this.filme = filme;
		this.inutilizada = inutilizada;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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
