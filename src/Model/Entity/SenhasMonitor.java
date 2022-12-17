package Model.Entity;

public class SenhasMonitor {
	private String senha;
	private Boolean status;
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public SenhasMonitor() {}

}
