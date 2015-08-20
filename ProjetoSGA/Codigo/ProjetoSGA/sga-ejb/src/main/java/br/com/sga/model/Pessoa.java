package br.com.sga.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MappedSuperclass
public class Pessoa extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(max = 50)
	@Column(name = "NOME")
	private String nome;

	@NotNull
	@Size(max = 20)
	@Column(name = "CPF_CNPJ")
	private String cpfCnpj;

	@Embedded
	@Valid
	@AttributeOverrides({
			@AttributeOverride(name = "logradouro", column = @Column(name = "ENDERECO_LOGRADOURO")),
			@AttributeOverride(name = "numero", column = @Column(name = "ENDERECO_NUMERO")),
			@AttributeOverride(name = "complemento", column = @Column(name = "ENDERECO_COMPLEMENTO")),
			@AttributeOverride(name = "bairro", column = @Column(name = "ENDERECO_BAIRRO")),
			@AttributeOverride(name = "cep", column = @Column(name = "ENDERECO_CEP")),
			@AttributeOverride(name = "cidade", column = @Column(name = "ENDERECO_CIDADE")),
			@AttributeOverride(name = "estado", column = @Column(name = "ENDERECO_ESTADO")) })
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
