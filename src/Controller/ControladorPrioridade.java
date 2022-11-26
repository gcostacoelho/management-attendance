package Controller;

import java.util.ArrayList;

import Model.Dao.FuncionarioDao;
import Model.Dao.PrioridadeDao;
import Model.Entity.Funcionario;
import Model.Entity.Prioridade;
import Model.Entity.ComboItem;
import View.TelaAdministrador;

public class ControladorPrioridade {
	private Prioridade prioridade;
    private int peso;
    private boolean statusPri;
	
	public void executa(TelaAdministrador frame) {
		Prioridade prioridade = new Prioridade();
		// ComboItem combo = new ComboItem();
		
		prioridade.setNomePri(frame.getNomePri().getText());
		prioridade.setDescricaoPri(frame.getDescricaoPri().getText());
		
		prioridade.setIdServico(((ComboItem)frame.getIdServico().getSelectedItem()).getValue());
		
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
