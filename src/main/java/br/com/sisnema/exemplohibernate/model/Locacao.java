package br.com.sisnema.exemplohibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Locacao {

	@Id
	@Column(name="cod_locacao")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@ManyToOne
	@JoinColumn(name="cod_midia",nullable=false)
	private Midia midia;

	@ManyToOne
	@JoinColumn(name="cod_cliente",nullable=false)
	private Cliente cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,updatable=false)
	private Date emprestimo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=true,updatable=false)
	private Date devolucao;
	
	@Column(nullable=false)
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
