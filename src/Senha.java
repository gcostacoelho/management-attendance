import java.sql.Date;
import java.sql.Time;

import javax.xml.crypto.Data;

public class Senha {
    private int numeroSen;
    private Date dataSen;
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


    public Date getDataSen() {
        return dataSen;
    }


    public void setDataSen(Date dataSen) {
        this.dataSen = dataSen;
    }


    public Time getHoraSen() {
        return horaSen;
    }


    public void setHoraSen(Time horaSen) {
        this.horaSen = horaSen;
    }


    public Senha(int numeroSen, Date dataSen, Time horaSen) {
        this.numeroSen = numeroSen;
        this.dataSen = dataSen;
        this.horaSen = horaSen;
    }
    
    
}
