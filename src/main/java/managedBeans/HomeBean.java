package managedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import controller.PresenteController;
import model.Presente;

@ManagedBean
@RequestScoped
public class HomeBean {

	
	private List<Presente> presentes;
	private PresenteController presenteController;
	

	public HomeBean() {
		super();
		this.presenteController = new PresenteController();
		this.presentes = listarPresente();
	}
	
	public String direcionarCadastroCrianca() {
		return "cadastroCrianca.xhtml";
	}

	public List<Presente> getPresentes() {
		return presentes;
	}

	public void setPresentes(List<Presente> presentes) {
		this.presentes = presentes;
	}
	
	public List<Presente> listarPresente(){
		return presenteController.findAllPrensente();
	}
	
	
}
