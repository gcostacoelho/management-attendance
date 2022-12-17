package Controller;

import java.util.ArrayList;

import Model.Dao.LoginDao;
import Model.Entity.Funcionario;
import Model.Entity.Login;
import View.TelaLogin;

public class ControladorLogin {
	private ArrayList<Login> respLogin;
	
	public int efetuaLogin(TelaLogin telaLogin){
		LoginDao loginDao = new LoginDao();
		Login login = new Login();
		login.setUsuario(telaLogin.getUsuario().getText());
		login.setSenha(telaLogin.getSenha().getText());
		
		respLogin = loginDao.consulta(login);
		if (respLogin.isEmpty()) {
			return 0;
		}else {
			if (respLogin.get(0).getPermissao() == 1) {
				return 1;
			}else {
				return 2;
			}
		}
		
	}
	
}
