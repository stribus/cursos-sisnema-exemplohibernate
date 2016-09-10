package br.com.sisnema.exemplohibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="filmeSeqJava", sequenceName="filme_seq")
public class Filme {
	
	@Id
	@GeneratedValue(generator="filmeSeqJava")
	@Column(name="cod_filme")
	private Integer codigo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cod_categoria",nullable=false)
	private Categoria categoria;
	
	@Column(nullable=false)
	private String descricao;
	
	@Temporal(TemporalType.TIMESTAMP)
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
