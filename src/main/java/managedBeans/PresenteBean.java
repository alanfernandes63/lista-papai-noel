package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import controller.PresenteController;
import model.Presente;

@ManagedBean
@ViewScoped
public class PresenteBean {
	
	private PresenteController presenteController;
	
	public PresenteBean() {
		super();
		presenteController = new PresenteController();
	}




	public void delete(Presente  presente) {
		
	}

}
