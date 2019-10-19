package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import controller.PresenteController;


@ViewScoped
@ManagedBean
public class LoginBean {
	
	private PresenteController presenteController;
	
	
	public LoginBean() {
		super();
		presenteController = new PresenteController();
	}

	public String redirectListarCriancas() {
		return "listarCrianca.xhtml";
	}
	
}
