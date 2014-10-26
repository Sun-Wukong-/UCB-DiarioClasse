package modelo.entidades;

import java.sql.Date;

public class Aula {
    
    private int idAula;
    private Date data;
    private String presenca;
    private String aluno;

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
    public String getPresenca() {
        return presenca;
    }

    /**
     * @param presenca the presenca to set
     */
    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }

    /**
     * @return the aluno
     */
    public String getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
    
    
    
}
