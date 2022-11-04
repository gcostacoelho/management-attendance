package Model.Entity;

public class Funcionario {
	private String nomeFun;
    private String cpf;
    private String telefone;
    private String email;
    private String cargo;
    private int permissao;
    
	public Funcionario() {
	
	}

	public String getNomeFun() {
		return nomeFun;
	}

	public void setNomeFun(String nomeFun) {
		this.nomeFun = nomeFun;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPermissao() {
		return permissao;
	}

	public void setPermissao(int permissao) {
		this.permissao = permissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
        
}
