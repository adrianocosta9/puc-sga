package br.com.sga;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.sga.facade.AlunoFacade;
import br.com.sga.facade.CursoFacade;
import br.com.sga.facade.DisciplinaFacade;
import br.com.sga.facade.UsuarioFacade;
import br.com.sga.model.Curso;
import br.com.sga.model.Disciplina;

@ManagedBean
public class IndexMB {
	
	private UserDetails userDetails;
	
	@SuppressWarnings("unused")
	@Inject 
	private UsuarioFacade usuarioService;
	
	@SuppressWarnings("unused")
	@Inject
	private AlunoFacade alunoService;
		
	@Inject
	private CursoFacade cursoService;	
	private List<Curso> cursos;
	
	@Inject
	private DisciplinaFacade disciplinaService;
	private List<Disciplina> disciplinas;
	private Map<String, String> cursosDisponiveis; 
	
	// Itens selecionados pelo usuario
	private String cursoSelecionado; 
	private String disciplinaSelecionada;
	private Map<String, String> disciplinasDisponiveis; 
	
	private List<AlunoNota> resultNotas;
	
	@PostConstruct
	public void init() {
		
		// Inicializando variaveis da pagina
		if (resultNotas == null) {
			resultNotas = new ArrayList<AlunoNota>();	
		}
			
		
		// Dados do usuario logado
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		userDetails = null;
		if (principal instanceof UserDetails) {
			userDetails = (UserDetails) principal;
		}	
		
		// Carregando todos os cursos disponiveis
		cursos = cursoService.findAll();
		cursosDisponiveis = new LinkedHashMap<String, String>();
		for(Curso curso : cursos) {
			cursosDisponiveis.put(curso.getNome(), curso.getId().toString());
		}	
		
		// Carregando todas as disciplinas
		disciplinas = disciplinaService.findAll();
		disciplinasDisponiveis = new LinkedHashMap<String, String>();
		for(Disciplina disciplina : disciplinas) {
			disciplinasDisponiveis.put(disciplina.getNome(), disciplina.getId().toString());
		}		
		
	}

	public void pesquisar() {		
		
		if (this.hasRole(new String[]{"ROLE_SECRETARIADO"})) {
			
			System.out.println("Executando metodo para ROLE_SECRETARIADO");
			resultNotas.addAll(MockAlunoNota.findAll());			
			
		} else if (this.hasRole(new String[]{"ROLE_COORDENADOR"})) {
			
			System.out.println("Executando metodo para ROLE_COORDENADOR");
			resultNotas.addAll(MockAlunoNota.findAll());				
		
		} else {
			
			System.out.println("Executando metodo para ROLE_ALUNO");
			resultNotas.add(MockAlunoNota.findNotaByAluno(userDetails.getUsername()));			
			
		}
		
	}

	public String getCursoSelecionado() {
		return cursoSelecionado;
	}

	public void setCursoSelecionado(String cursoSelecionado) {
		this.cursoSelecionado = cursoSelecionado;
	}

	public String getDisciplinaSelecionada() {
		return disciplinaSelecionada;
	}

	public void setDisciplinaSelecionada(String disciplinaSelecionada) {
		this.disciplinaSelecionada = disciplinaSelecionada;
	}

	public Map<String, String> getCursosDisponiveis() {
		return cursosDisponiveis;
	}

	public void setCursosDisponiveis(Map<String, String> cursosDisponiveis) {
		this.cursosDisponiveis = cursosDisponiveis;
	}

	public Map<String, String> getDisciplinasDisponiveis() {
		return disciplinasDisponiveis;
	}

	public void setDisciplinasDisponiveis(Map<String, String> disciplinasDisponiveis) {
		this.disciplinasDisponiveis = disciplinasDisponiveis;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	public boolean hasRole(String[] roles) {
	    
		boolean result = false;
		
	    for (GrantedAuthority authority : userDetails.getAuthorities()) {
	        String userRole = authority.getAuthority();
	        for (String role : roles) {
	            if (role.equals(userRole)) {
	                result = true;
	                break;
	            }
	        }

	        if (result) {
	            break;
	        }
	    }

	    return result;
	}

	public List<AlunoNota> getResultNotas() {
		return resultNotas;
	}

	public void setResultNotas(List<AlunoNota> resultNotas) {
		this.resultNotas = resultNotas;
	}

}
