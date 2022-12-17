package Controller;

import java.util.ArrayList;

import Model.Dao.SenhaDao;
import Model.Entity.Atendimento;
import Model.Entity.Ticket;
import View.TelaAtendente;

public class ControladorAtendimento {
	
	
	public ArrayList<Ticket> consultaSenha() {
		SenhaDao ticket = new SenhaDao();
		return ticket.consultaSenha();
		
	}
}
