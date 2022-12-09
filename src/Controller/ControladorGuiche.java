package Controller;

import java.util.ArrayList;

import Model.Dao.GuicheDao;
import Model.Entity.Guiche;

public class ControladorGuiche {
	
	public ArrayList<Guiche> consultarDesc(){
		GuicheDao guicheDao = new GuicheDao();
		return guicheDao.consultarDesc();
	}	
	
}
