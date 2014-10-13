package apresentacao;

import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.entidades.Turma;

public class TurmaTableModel extends AbstractTableModel {
    
    private List<Turma> turmas;
    private List<String> colunas;
    
    public TurmaTableModel (List<Turma> turmas) {
        this.turmas = turmas;
        colunas = Arrays.asList( "IdTurma", "Nome","Curso", "Disciplina","Periodo","Turno" );
    }
    
    @Override
    public int getRowCount() {
        return turmas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Turma turma = turmas.get(rowIndex);
        switch(columnIndex) {
            case 0: return turma.getIdTurma();
            case 1: return turma.getNome();
            case 2: return turma.getCurso();
            case 3: return turma.getDisciplina();
            case 4: return turma.getPeriodo();
            case 5: return turma.getTurno();
        }
        return null;
        
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }           
}
