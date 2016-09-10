package br.com.sisnema.exemplohibernate.model;

public class Endereco {

	private Cliente cliente;
	private String rua;
	private Integer numero;
	private String Bairro;
	private String estado;
	private String cep;
	private String cidade;
	private String complemento;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Endereco(Cliente cliente, String rua, Integer numero, String bairro, String estado, String cep,
			String cidade, String complemento) {
		super();
		this.cliente = cliente;
		this.rua = rua;
		this.numero = numero;
		Bairro = bairro;
		this.estado = estado;
		this.cep = cep;
		this.cidade = cidade;
		this.complemento = complemento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [cliente=" + cliente + ", rua=" + rua + ", numero=" + numero + ", Bairro=" + Bairro
				+ ", estado=" + estado + ", cep=" + cep + ", cidade=" + cidade + ", complemento=" + complemento + "]";
	}

}
