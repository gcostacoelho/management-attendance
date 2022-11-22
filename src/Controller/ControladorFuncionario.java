package Controller;

import Model.Entity.Funcionario;
import Model.Entity.Login;
import Model.Entity.Usuario;
import java.util.ArrayList;
import Model.Dao.FuncionarioDao;
import Model.Dao.LoginDao;
import Model.Dao.UsuarioDao;
import View.TelaAdministrador;

public class ControladorFuncionario {
	
	private Funcionario funcionario, funcionarioId;
	private Usuario usuario;
	private int permissao;
	
	public void executa(TelaAdministrador frame) {
		Funcionario funcionario = new Funcionario();
		Login login = new Login();
		
		funcionario.setNomeFun(frame.getNomeFunc().getText());
		funcionario.setCpf(frame.getCpfFunc().getText());
		funcionario.setTelefone(frame.getTelFunc().getText());
		funcionario.setEmail(frame.getEmailFunc().getText());
		funcionario.setCargo(frame.getCargoFunc().getText());
		if (frame.getpermiFunc().getSelectedIndex() == 1) {
			permissao = 1;
		}else {
			permissao = 2;
		}
		funcionario.setPermissao(permissao);
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		funcionarioDao.salvar(funcionario);
		
		//Insere usuário de acordo com o funcionário
		Usuario usuario = new Usuario();
		usuario.setUsuario(frame.getUsuarioFunc().getText());
		usuario.setSenha(frame.getSenhaFunc().getText());
		Funcionario funcionarioId = new Funcionario();
		funcionarioId = funcionarioDao.consultaIdFunc();
		usuario.setIdFunc(funcionarioId.getId());
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.salvar(usuario);
	}
	public ArrayList<Funcionario> consultar() {
		FuncionarioDao funcionarioDao = new FuncionarioDao();
        return funcionarioDao.consulta();     	
   }
}
