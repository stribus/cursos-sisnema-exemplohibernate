package br.com.sisnema.exemplohibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@Column(name="cod_cliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(nullable=false)
	private String nome;
	
	private String telefone;
	
	private String Celular;
	
	private String email;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(Integer codigo) {
		super();
		this.codigo = codigo;
	}


	public Cliente(Integer codigo, String nome, String telefone, String celular, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		Celular = celular;
		this.email = email;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCelular() {
		return Celular;
	}


	public void setCelular(String celular) {
		Celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", Celular=" + Celular
				+ ", email=" + email + "]";
	}
	

}
