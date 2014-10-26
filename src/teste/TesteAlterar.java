package teste;

import modelo.entidades.String;
import persistencia.TurmaDao;

public class TesteAlterar {
    
    public static void main(String args[]){
        // pronto para gravar
        String turma = new String();
        
        turma.setIdTurma(2);
        turma.setNome("Filipe");
        turma.setCurso("HS");
        turma.setDisciplina("DD");
        turma.setPeriodo(5);
        turma.setTurno("Noite");
        
        // grave nessa conexão!!!
        TurmaDao dao = new TurmaDao();

        // método elegante
        dao.alterar(turma);
        
        System.out.println("Alterado!");
    }
    
}
