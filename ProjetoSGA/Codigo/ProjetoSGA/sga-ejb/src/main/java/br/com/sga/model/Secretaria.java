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
@Table(name = "SECRETARIA", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
@SequenceGenerator(name = "SE_SECRETARIA", sequenceName = "SE_SECRETARIA")
@Access(AccessType.FIELD)
public class Secretaria extends AppBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_SECRETARIA")
	private Long id;

	@OneToMany(targetEntity = Aluno.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "secretaria")
	@ForeignKey(name = "FK_SECRETARIA_ALUNO")
	@Valid
	private List<Aluno> listAluno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Aluno> getListAluno() {
		return listAluno;
	}

	public void setListAluno(List<Aluno> listAluno) {
		this.listAluno = listAluno;
	}

}
