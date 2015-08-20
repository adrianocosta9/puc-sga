package br.com.sga.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

@Embeddable
@Access(AccessType.FIELD)

@NamedQueries({
		@NamedQuery(name = "Endereco.querySelLookup", query = "select logradouro as logradouro from Endereco where id = ? order by logradouro asc") 
		})
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Size(max = 80)
	private String logradouro;

	@Digits(integer = 10, fraction = 0)
	private Integer numero;

	@Size(max = 50)
	private String complemento;

	@Size(max = 50)
	private String bairro;

	@Size(max = 50)
	private String cidade;

	@Size(max = 10)
	private String estado;

	@Size(max = 10)
	private String cep;

	public Endereco() {
	}

	public Endereco(String logradouro, Integer numero, String complemento, String bairro, String cep, String cidade,
			String estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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

	@Override
	public String toString() {
		return getLogradouro();
	}

}