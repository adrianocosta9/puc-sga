package br.com.sga.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@XmlRootElement
@Table(name = "MATRICULA", uniqueConstraints = @UniqueConstraint(columnNames = "PERIODO"))
@SequenceGenerator(name = "SE_MATRICULA", sequenceName = "SE_MATRICULA")
@Access(AccessType.FIELD)
public class Matricula extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_MATRICULA")
	private Long id;
	
	@ManyToOne(targetEntity = Aluno.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_MATRICULA_ALUNO")
	@NotNull
	private Aluno aluno;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "PERIODO")
	private String periodo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
}
