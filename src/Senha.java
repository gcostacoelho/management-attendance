import java.sql.Time;
import javax.xml.crypto.Data;

public class Senha {
    private int numeroSen;
    private Data dataSen;
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


    public Data getDataSen() {
        return dataSen;
    }


    public void setDataSen(Data dataSen) {
        this.dataSen = dataSen;
    }


    public Time getHoraSen() {
        return horaSen;
    }


    public void setHoraSen(Time horaSen) {
        this.horaSen = horaSen;
    }


    public Senha(int numeroSen, Data dataSen, Time horaSen) {
        this.numeroSen = numeroSen;
        this.dataSen = dataSen;
        this.horaSen = horaSen;
    }
    
    
}
