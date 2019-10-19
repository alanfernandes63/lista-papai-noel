package controller;

import java.util.List;

import dao.PresenteDao;
import model.Presente;

public class PresenteController {
	
	private PresenteDao presenteDao;
	
	public PresenteController() {
		super();
		presenteDao = new PresenteDao();
	}
	
	public Presente save(Presente presente) {
		presenteDao.saveOrUpdate(presente);
		return null;
	}
	
	public List<Presente> findAllPrensente() {
		return presenteDao.findAll();
	}

}
