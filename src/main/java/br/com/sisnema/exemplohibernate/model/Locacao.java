package br.com.sisnema.exemplohibernate.model;

import java.util.Date;

public class Locacao {

	private Integer codigo;
	private Midia midia;
	private Cliente cliente;
	private Date emprestimo;
	private Date devolucao;
	private String obs;

	public Locacao() {
		super();
	}

	public Locacao(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public Locacao(Integer codigo, Midia midia, Cliente cliente, Date emprestimo, Date devolucao, String obs) {
		super();
		this.codigo = codigo;
		this.midia = midia;
		this.cliente = cliente;
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
		this.obs = obs;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Date emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "Locacao [codigo=" + codigo + ", midia=" + midia + ", cliente=" + cliente + ", emprestimo=" + emprestimo
				+ ", devolucao=" + devolucao + ", obs=" + obs + "]";
	}

}
