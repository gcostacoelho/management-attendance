package Controller;

import java.util.ArrayList;

import Model.Dao.FuncionarioDao;
import Model.Dao.PrioridadeDao;
import Model.Entity.Funcionario;
import Model.Entity.Prioridade;
import View.TelaAdministrador;

public class ControladorPrioridade {
	private Prioridade prioridade;
    private int peso;
    private boolean statusPri;
	
	public void executa(TelaAdministrador frame) {
		Prioridade prioridade = new Prioridade();
		
		prioridade.setNomePri(frame.getNomePri().getText());
		prioridade.setDescricaoPri(frame.getDescricaoPri().getText());
		
		if (frame.getPesoPri().getSelectedIndex() == 1) {
			peso = 1;
		}else {
			peso = 2;
		}
		prioridade.setPeso(peso);
		
		if (frame.getStatusPri().getSelectedIndex() == 1) {
			statusPri = true;
		}else {
			statusPri = false;
		}
		prioridade.setStatusPri(statusPri);
		
		PrioridadeDao prioridadeDao = new PrioridadeDao();
		prioridadeDao.salvar(prioridade);
	}
		
}
