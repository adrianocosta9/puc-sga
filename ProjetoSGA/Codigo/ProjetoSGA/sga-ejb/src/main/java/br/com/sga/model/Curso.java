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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@XmlRootElement
@Table(name = "CURSO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
@SequenceGenerator(name = "SE_CURSO", sequenceName = "SE_CURSO")
@Access(AccessType.FIELD)
public class Curso extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_CURSO")
	private Long id;

	@OneToMany(targetEntity = CursoDisciplina.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "curso")
	@ForeignKey(name = "FK_CURSO_DISCIPLINA")
	@Valid
	private List<CursoDisciplina> listCursoDisciplina;

	@OneToMany(targetEntity = Aluno.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "curso")
	@ForeignKey(name = "FK_CURSO_ALUNO")
	@Valid
	private List<Aluno> listAluno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CursoDisciplina> getListCursoDisciplina() {
		return listCursoDisciplina;
	}

	public void setListCursoDisciplina(List<CursoDisciplina> listCursoDisciplina) {
		this.listCursoDisciplina = listCursoDisciplina;
	}

	public List<Aluno> getListAluno() {
		return listAluno;
	}

	public void setListAluno(List<Aluno> listAluno) {
		this.listAluno = listAluno;
	}

}
