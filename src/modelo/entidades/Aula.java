package modelo.entidades;

import java.sql.Date;

public class Aula {
    
    private int idAula;
    private Date data;
    private boolean presenca;

    /**
     * @return the idAula
     */
    public int getIdAula() {
        return idAula;
    }

    /**
     * @param idAula the idAula to set
     */
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the presenca
     */
    public boolean getPresenca() {
        return presenca;
    }

    /**
     * @param presenca the presenca to set
     */
    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
}
