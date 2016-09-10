package br.com.sisnema.exemplohibernate.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_categoria")
	private Integer codigo;
	
	@Column(nullable=false,length=30)
	private String descricao;
	
	@OneToMany(mappedBy="categoria")
	private List<Filme> filmes;

	public Categoria() {
		super();
	}

	public Categoria(Integer codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Categoria(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
