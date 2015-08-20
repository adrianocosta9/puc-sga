package br.com.sga;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.sga.model.Aluno;
import br.com.sga.model.AlunoDisciplina;
import br.com.sga.model.Disciplina;

@ManagedBean
public class IndexMB {

	private String selectedItem; // +getter +setter
	private Map<String, String> availableItems; // +getter (no setter necessary)

	private List<AlunoDisciplina> alunoDisciplina;

	@PostConstruct
	public void init() {
		availableItems = new LinkedHashMap<String, String>();
		alunoDisciplina = new ArrayList<AlunoDisciplina>();
		availableItems.put("Foo label", "foo");
		availableItems.put("Bar label", "bar");
		availableItems.put("Baz label", "baz");
		alunoDisciplina.add(new AlunoDisciplina(1L,new Aluno("JOSÉ"), new Disciplina("AWS"),10.0 ));
	}

	public void pesquisar() {		
		System.out.println("teste");
	}

	public String getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(String selectedItem) {
		this.selectedItem = selectedItem;
	}

	public Map<String, String> getAvailableItems() {
		return availableItems;
	}

	public void setAvailableItems(Map<String, String> availableItems) {
		this.availableItems = availableItems;
	}

	public List<AlunoDisciplina> getAlunoDisciplina() {
		return alunoDisciplina;
	}

	public void setAlunoDisciplina(List<AlunoDisciplina> alunoDisciplina) {
		this.alunoDisciplina = alunoDisciplina;
	}

}
