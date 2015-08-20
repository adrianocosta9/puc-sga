package br.com.sga;

public class AlunoNota {
	
	private String matricula;
	private String nomeAluno;
	private String nota;
	private String disciplina;
	private String curso;
	private String periodo;
	
	public AlunoNota(String matricula, String nomeAluno, String nota,
			String periodo, String disciplina, String curso) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.nota = nota;
		this.periodo = periodo;
		this.disciplina = disciplina;
		this.curso = curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
