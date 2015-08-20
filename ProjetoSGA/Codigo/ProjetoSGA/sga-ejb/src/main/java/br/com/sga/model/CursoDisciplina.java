package br.com.sga.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@XmlRootElement
@Table(name = "CURSO_DISCIPLINA", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
@SequenceGenerator(name = "SE_CURSO_DISCIPLINA", sequenceName = "SE_CURSO_DISCIPLINA")
@Access(AccessType.FIELD)
public class CursoDisciplina extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_CURSO_DISCIPLINA")
	private Long id;

	@ManyToOne(targetEntity = Curso.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_DISCIPLINA_CURSO")
	@NotNull
	private Curso curso;

	@ManyToOne(targetEntity = Disciplina.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_CURSO_DISCIPLINA_CURSO")
	@NotNull
	private Disciplina disciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
