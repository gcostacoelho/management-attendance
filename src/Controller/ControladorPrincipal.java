package Controller;

import Model.Entity.Funcionario;
import Model.Dao.FuncionarioDao;
import View.TelaAdministrador;
import View.TelaCadastro;

public class ControladorPrincipal {
	
	private Funcionario funcionario;
	private int permissao;
	
	public void executa(TelaAdministrador frame) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFun(frame.getNomeFunc().getText());
		funcionario.setCpf(frame.getCpfFunc().getText());
		funcionario.setTelefone(frame.getTelFunc().getText());
		funcionario.setEmail(frame.getEmailFunc().getText());
		funcionario.setCargo(frame.getCargoFunc().getText());
		if (frame.getpermiFunc().getSelectedItem() == "Administrador") {
			permissao = 1;
		}else {
			permissao = 2;
		}
		
		System.out.println(permissao);
		funcionario.setPermissao(permissao);
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		funcionarioDao.salvar(funcionario);
	}
}
