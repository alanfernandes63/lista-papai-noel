package managedBeans;

import java.io.Serializable;
import java.util.List;

/*
 * 
 * author alan fernandes*/

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import controller.CriancaController;
import model.Crianca;

@ManagedBean
@RequestScoped
public class CriancaBean implements Serializable{
	
	private String nome;
	private String idade;
	private long id;
	private List<Crianca> criancas;
	private Crianca criancaUpdate;

	private CriancaController criancaController;

	public CriancaBean() {
		super();
		criancaController = new CriancaController();
		criancas = criancaController.findAll();
		nome = "";
		idade = "";
	}
	
	
	public String save() {
		
		if(criancaUpdate == null) {
			Crianca cri = new Crianca(nome,Integer.parseInt(idade));
				cri.setId(id);
			criancaController.save(cri);
			criancas = criancaController.findAll();
			return "listarCrianca.xhtml";
		}
		criancaUpdate.setId(id);
		criancaUpdate.setNome(nome);
		criancaUpdate.setIdade(Integer.parseInt(idade));
		criancaController.save(criancaUpdate);
		
		return "listarCrianca.xhtml";
	}
	
	public void delete(Crianca crianca) {
		criancaController.delete(crianca);
		criancas = criancaController.findAll();
		
	}
	
	public String direcionarAtualizar(Crianca crianca) {
		criancaUpdate = crianca;
		id = criancaUpdate.getId();
		nome = criancaUpdate.getNome();
		idade = Integer.toString(criancaUpdate.getIdade());
		return "cadastroCrianca.xhtml";
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

	public Crianca getCriancaUpdate() {
		return criancaUpdate;
	}

	public void setCriancaUpdate(Crianca criancaUpdate) {
		this.criancaUpdate = criancaUpdate;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	
}
