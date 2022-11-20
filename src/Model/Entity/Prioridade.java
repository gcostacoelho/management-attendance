package Model.Entity;
public class Prioridade {
    private String nomePri, descricaoPri;
    private int peso;
    private boolean statusPri;
     
    public Prioridade() {}
    
    public String getNomePri() {
        return nomePri;
    }

    public void setNomePri(String nomePri) {
        this.nomePri = nomePri;
    }

    public String getDescricaoPri() {
        return descricaoPri;
    }

    public void setDescricaoPri(String descricaoPri) {
        this.descricaoPri = descricaoPri;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isStatusPri() {
        return statusPri;
    }

    public void setStatusPri(boolean statusPri) {
        this.statusPri = statusPri;
    }
    
}
