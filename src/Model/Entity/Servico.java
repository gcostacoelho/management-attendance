package Model.Entity;
public class Servico {
    private String sigla, nome, desc;
    private boolean status;

    public String getSigla() { return sigla; }
    
    public void setSigla(String sigla) { this.sigla = sigla; }
    
    public String getNome() { return nome; }
    
    public void setNome(String nome) { this.nome = nome; }
    
    public String getDesc() { return desc; }
    
    public void setDesc(String desc) { this.desc = desc; }
    
    public boolean isStatus() { return status; }

    public void setStatus(boolean status) { this.status = status; }

    public Servico(String sigla, String nome, String desc, boolean status) {
        this.sigla = sigla;
        this.nome = nome;
        this.desc = desc;
        this.status = status;
    }

    
    
}
