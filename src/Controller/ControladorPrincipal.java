package Controller;

import Model.Entity.Funcionario;
import Model.Dao.FuncionarioDao;
import View.TelaCadastro;

public class ControladorPrincipal {
	
	private Funcionario funcionario;
	private int permissao;
	
	public void executa(TelaCadastro frame) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFun(frame.getNomeFun().getText());
		funcionario.setCpf(frame.getCpf().getText());
		funcionario.setTelefone(frame.getTelefone().getText());
		funcionario.setEmail(frame.getEmail().getText());
		if (frame.getPermissao().getSelectedItem() == "Administrador") {
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
