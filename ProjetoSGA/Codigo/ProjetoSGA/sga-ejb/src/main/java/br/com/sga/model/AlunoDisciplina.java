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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@XmlRootElement
@Table(name = "ALUNO_DISCIPLINA", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
@SequenceGenerator(name = "SE_ALUNO_DISCIPLINA", sequenceName = "SE_ALUNO_DISCIPLINA")
@Access(AccessType.FIELD)
public class AlunoDisciplina extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_ALUNO_DISCIPLINA")
	private Long id;

	@ManyToOne(targetEntity = Aluno.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_DISCIPLINA_ALUNO")
	@NotNull
	private Aluno aluno;

	@ManyToOne(targetEntity = Aluno.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_ALUNO_DISCIPLINA_DISCIPLINA")
	@NotNull
	private Disciplina disciplina;

	@Digits(integer = 3, fraction = 2)
	@Column(name = "NOTA")
	private Double nota;

	public AlunoDisciplina (Long id, Aluno aluno, Disciplina disciplina, Double nota){
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
