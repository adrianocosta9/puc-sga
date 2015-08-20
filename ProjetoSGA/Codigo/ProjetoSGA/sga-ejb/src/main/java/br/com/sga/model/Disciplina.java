package br.com.sga.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@XmlRootElement
@Table(name = "DISCIPLINA", uniqueConstraints = @UniqueConstraint(columnNames = "NOME"))
@SequenceGenerator(name = "SE_DISCIPLINA", sequenceName = "SE_DISCIPLINA")
@Access(AccessType.FIELD)
public class Disciplina extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_DISCIPLINA")
	private Long id;
	
	@OneToMany(targetEntity = AlunoDisciplina.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "disciplina")
	@ForeignKey(name = "FK_DISCIPLINA_ALUNO_DISCIPLINA")
	@Valid
	private List <AlunoDisciplina> listAlunoDisciplina;
	
	@OneToMany(targetEntity = CursoDisciplina.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "disciplina")
	@ForeignKey(name = "FK_DISCIPLINA_CURSO_DISCIPLINA")
	@Valid
	private List <CursoDisciplina> listCursoDisciplina;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "NOME")
	private String nome;

	public Disciplina (String nome) {
		this.nome = nome;
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

	public List<CursoDisciplina> getListCursoDisciplina() {
		return listCursoDisciplina;
	}

	public void setListCursoDisciplina(List<CursoDisciplina> listCursoDisciplina) {
		this.listCursoDisciplina = listCursoDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
