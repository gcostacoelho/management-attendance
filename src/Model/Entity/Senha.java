package Model.Entity;
import java.sql.Date;
import java.sql.Time;

public class Senha {
    private int numeroSen;
    private Date dateSen;
    private Time horaSen;

    public String gerarSenha(int senhaAnt){
        String senha = "Senha: " + senhaAnt + "Local: Sala1";
        return senha;
    }
    

    public int getNumeroSen() {
        return numeroSen;
    }


    public void setNumeroSen(int numeroSen) {
        this.numeroSen = numeroSen;
    }


    public Date getDateSen() {
        return dateSen;
    }


    public void setDateSen(Date dateSen) {
        this.dateSen = dateSen;
    }


    public Time getHoraSen() {
        return horaSen;
    }


    public void setHoraSen(Time horaSen) {
        this.horaSen = horaSen;
    }

    public Senha(int numeroSen, Date dateSen, Time horaSen) {
        this.numeroSen = numeroSen;
        this.dateSen = dateSen;
        this.horaSen = horaSen;
    }
    
    
}
