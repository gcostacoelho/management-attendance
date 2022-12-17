package Model.Entity;
public class Servico {
    private String sigla, nome, desc;
    private int idServico;
    private boolean status;

    public int getIdServico() { return idServico; }

	public void setIdServico(int idServico) { this.idServico = idServico; }

	public Servico() {}
    
    public String getSigla() { return sigla; }
    
    public void setSigla(String sigla) { this.sigla = sigla; }
    
    public String getNome() { return nome; }
    
    public void setNome(String nome) { this.nome = nome; }
    
    public String getDesc() { return desc; }
    
    public void setDesc(String desc) { this.desc = desc; }
    
    public boolean isStatus() { return status; }

    public void setStatus(boolean status) { this.status = status; }
    
    public String verificaStatus() {
    	if (this.status == false) {
    		return "Inativo";
    	}else {
    		return "Ativo";
    	}
    }
    
}
