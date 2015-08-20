package br.com.sga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "SE_AUTORIZACAO", sequenceName = "SE_AUTORIZACAO")
public class Autorizacao extends AppBase{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SE_AUTORIZACAO")
	private Long id;
	
	@Size(max = 50)
	private String nome;

	public Autorizacao() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
