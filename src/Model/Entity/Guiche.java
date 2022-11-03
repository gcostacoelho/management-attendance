package Model.Entity;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import Model.Entity.Guiche;

public class Guiche {
    private int numeroGui;
    private String descricaoGui;

    public int trocarGuiche(){
        return numeroGui;
    }


    public int getNumeroGui() {
        return numeroGui;
    }


    public void setNumeroGui(int numeroGui) {
        this.numeroGui = numeroGui;
    }


    public String getDescricaoGui() {
        return descricaoGui;
    }


    public void setDescricaoGui(String descricaoGui) {
        this.descricaoGui = descricaoGui;
    }


    public Guiche(int numeroGui, String descricaoGui) {
        this.numeroGui = numeroGui;
        this.descricaoGui = descricaoGui;
    }

    
}
