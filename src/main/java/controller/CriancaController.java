package controller;

import java.io.Serializable;
import java.util.List;

import dao.CriancaDao;
import model.Crianca;

public class CriancaController implements Serializable{
	
	private CriancaDao criancaDao;

	public CriancaController() {
		super();
		criancaDao = new CriancaDao();
	}
	
	public Crianca save(Crianca crianca) {
		
		criancaDao.saveOrUpdate(crianca);
		
		return null;
	}
	
	public List<Crianca> findAll(){
		return criancaDao.findAll();
	}
	
	public Crianca delete(Crianca crianca) {
		return criancaDao.delete(crianca);
	}

}
