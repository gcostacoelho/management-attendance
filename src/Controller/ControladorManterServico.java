package Controller;

import java.util.ArrayList;

import Model.Dao.ServicoDao;
import Model.Entity.Servico;
import View.TelaAdministrador;

public class ControladorManterServico {
    private Servico servico;
    private boolean status;
    
    public void executa(TelaAdministrador frame) {
    	Servico servico = new Servico();
    	
    	servico.setSigla(frame.getSiglaServ().getText());
    	servico.setNome(frame.getNomeServ().getText());
    	servico.setDesc(frame.getDescServ().getText());
    	
    	if(frame.getStatusServ().getSelectedIndex() == 0) {;
    		status = true;
    	}else {
    		status = false;
    	}
    	servico.setStatus(status);
    	
    	ServicoDao servicoDao = new ServicoDao();
    	servicoDao.salvar(servico);
    }

	public ArrayList<Servico> consultar() {
		ServicoDao servicoDao = new ServicoDao();
		return servicoDao.consulta();
	}
	
	public ArrayList<Servico> consulta_idServico(){
		ServicoDao servicoDao = new ServicoDao();
		return servicoDao.consulta_id();
	}
	
}
