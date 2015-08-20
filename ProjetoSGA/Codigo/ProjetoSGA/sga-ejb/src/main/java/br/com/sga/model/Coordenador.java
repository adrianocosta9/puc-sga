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
@Table(name = "COORDENADOR", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
@SequenceGenerator(name = "SE_COORDENADOR", sequenceName = "SE_COORDENADOR")
@Access(AccessType.FIELD)
public class Coordenador extends Pessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_COORDENADOR")
	private Long id;
	
	@ManyToOne(targetEntity = Curso.class, fetch = FetchType.LAZY)
	@ForeignKey(name = "FK_COORDENADOR_CURSO")
	@NotNull
	private Curso curso;

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
	
	

}
