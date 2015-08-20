package br.com.sga.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author Adriano de Paula Costa 
 * 
 * Classe Default, os atributos declarados desta classe serao replicados
 * para as demais entidades concretas do sistema 
 * 
 * @version 0.1 - Atributos de auditoria.
 * @since 2015
 * 
 */
@MappedSuperclass
public class AppBase implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Version
	@NotNull
	@Column(name = "VERSAO")
	@Digits(integer = 5, fraction = 0)
	private Integer versao = new Integer(0);

	@NotNull
	@Size(max = 50)
	@Column(name = "USUARIO_ULT_ALTERACAO")
	private String usuarioUltAlteracao = "";

	@NotNull
	@Column(name = "DATA_ULT_ALTERACAO")
	private Date dataUltAlteracao = new Date();
	
	@NotNull
	@Size(max = 50)
	@Column(name = "USUARIO_CRIACAO")
	private String usuarioCriacao = "";

	@NotNull
	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao = new Date();

	public AppBase() {
	}

	/**
	 * @return the usuarioUltAlteracao
	 */
	public String getUsuarioUltAlteracao() {
		return usuarioUltAlteracao;
	}

	/**
	 * @param usuarioUltAlteracao
	 *            the usuarioUltAlteracao to set
	 */
	public void setUsuarioUltAlteracao(String usuarioUltAlteracao) {
		this.usuarioUltAlteracao = usuarioUltAlteracao;
	}

	/**
	 * @return the versao
	 */
	public Integer getVersao() {
		return versao;
	}

	/**
	 * @param versao
	 *            the versao to set
	 */
	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	/**
	 * @return the dataUltAlteracao
	 */
	public Date getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	/**
	 * @param dataUltAlteracao
	 *            the dataUltAlteracao to set
	 */
	public void setDataUltAlteracao(Date dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}

	/**
	 * @return the usuarioCriacao
	 */
	public String getUsuarioCriacao() {
		return usuarioCriacao;
	}

	/**
	 * @param usuarioCriacao the usuarioCriacao to set
	 */
	public void setUsuarioCriacao(String usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}

	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	

}