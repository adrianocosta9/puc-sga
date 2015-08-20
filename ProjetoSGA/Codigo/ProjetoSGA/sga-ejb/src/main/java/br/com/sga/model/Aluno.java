package br.com.sga.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@XmlRootElement
@Table(name = "ALUNO", uniqueConstraints = @UniqueConstraint(columnNames = "CPF_CNPJ"))
@SequenceGenerator(name = "SE_ALUNO", sequenceName = "SE_ALUNO")
@Access(AccessType.FIELD)
public class Aluno extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_ALUNO")
	private Long id;

	@OneToMany(targetEntity = AlunoDisciplina.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "aluno")
	@ForeignKey(name = "FK_ALUNO_DISCIPLINA")
	@Valid
	private List<AlunoDisciplina> listAlunoDisciplina;

	@OneToMany(targetEntity = Matricula.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "aluno")
	@ForeignKey(name = "FK_ALUNO_MATRICULA")
	@Valid
	private List<Matricula> listMatricula;

	@ManyToOne(targetEntity = Curso.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_ALUNO_CURSO")
	@NotNull
	private Curso curso;

	@ManyToOne(targetEntity = Secretaria.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_ALUNO_SECRETARIA")
	@NotNull
	private Secretaria secretaria;

	public Aluno (String nome){
		this.setNome(nome);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<AlunoDisciplina> getListAlunoDisciplina() {
		return listAlunoDisciplina;
	}

	public void setListAlunoDisciplina(List<AlunoDisciplina> listAlunoDisciplina) {
		this.listAlunoDisciplina = listAlunoDisciplina;
	}

	public List<Matricula> getListMatricula() {
		return listMatricula;
	}

	public void setListMatricula(List<Matricula> listMatricula) {
		this.listMatricula = listMatricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

}
