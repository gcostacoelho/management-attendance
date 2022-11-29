package Model.Entity;

import java.sql.Date;
import java.sql.Time;

public class Ticket {
	private int senha;
	private String siglaServico, prioridade, nomeSer;
	private Time horaSenha;
	private Date dataSenha;
	
	public Ticket() {
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getSiglaServico() {
		return siglaServico;
	}
	public void setSiglaServico(String siglaServico) {
		this.siglaServico = siglaServico;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public Time getHoraSenha() {
		return horaSenha;
	}
	public void setHoraSenha(Time horaSenha) {
		this.horaSenha = horaSenha;
	}
	public Date getDataSenha() {
		return dataSenha;
	}
	public void setDataSenha(Date dataSenha) {
		this.dataSenha = dataSenha;
	}
	public String getNomeSer() {
		return nomeSer;
	}
	public void setNomeSer(String nomeSer) {
		this.nomeSer = nomeSer;
	}

}
