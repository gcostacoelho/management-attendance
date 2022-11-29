package Controller;

import Model.Dao.SenhaDao;
import Model.Entity.Ticket;

public class ControladorSolicitarServico {
	
	public void adicionaSenha(int idPrioridade) {
		SenhaDao ticket = new SenhaDao();
		ticket.addSenha(idPrioridade);
	}
	
	public Ticket ultimaSenha() {
		SenhaDao ticket = new SenhaDao();
		return ticket.consultaUltimaSenha();
	}
}
