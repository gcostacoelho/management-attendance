package Model.Entity;

import java.sql.Date;
import java.sql.Time;

public class Atendimento {
    private String nota, statusAte;
    private Date dataAte;
    private Time horaAte;
    
    public Atendimento() {}

    public int chamarProx(int senhaAtual){
        return senhaAtual + 1;
    }

    public int chamarNovamante(int senhaAtual){
        return senhaAtual;
    }

    public void avaliarAtedimento(){

    }

    public void encerrarAtendimento(){
        
    }

    public String getNota() {
        return nota;
    }


    public void setNota(String nota) {
        this.nota = nota;
    }


    public String getStatusAte() {
        return statusAte;
    }


    public void setStatusAte(String statusAte) {
        this.statusAte = statusAte;
    }


    public Date getDataAte() {
        return dataAte;
    }


    public void setDataAte(Date dataAte) {
        this.dataAte = dataAte;
    }


    public Time getHoraAte() {
        return horaAte;
    }


    public void setHoraAte(Time horaAte) {
        this.horaAte = horaAte;
    }
    
}
