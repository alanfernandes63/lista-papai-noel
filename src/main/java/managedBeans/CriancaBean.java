package managedBeans;

import java.util.List;

/*
 * 
 * author alan fernandes*/

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import controller.CriancaController;
import model.Crianca;

@ManagedBean
@ViewScoped
public class CriancaBean {
	
	private String nome;
	private String idade;
	private List<Crianca> criancas;

	private CriancaController criancaController;

	public CriancaBean() {
		super();
		criancaController = new CriancaController();
		criancas = criancaController.findAll();
	}
	
	public String save() {
		if(nome.trim() != "" && idade.trim() != "") {
			int idade = Integer.parseInt(this.idade);
		criancaController.save(new Crianca(nome,idade));
		nome = "";
		this.idade = "";
		}
		
		return "listarCrianca.xhtml";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public List<Crianca> getCriancas() {
		return criancas;
	}

	public void setCriancas(List<Crianca> criancas) {
		this.criancas = criancas;
	}

	public CriancaController getCriancaController() {
		return criancaController;
	}

	public void setCriancaController(CriancaController criancaController) {
		this.criancaController = criancaController;
	}
	
}
